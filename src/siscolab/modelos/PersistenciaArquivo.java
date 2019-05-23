package siscolab.modelos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class PersistenciaArquivo<Classe> {
    public void salvar(Classe e, String path) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Dados salvos em: "+path);
        } catch (IOException i) {
            throw i;
        }
    }

    public Classe carregar(String path) throws IOException, ClassNotFoundException {
        try {
            Classe e;
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Classe) in.readObject();
            in.close();
            fileIn.close();
            return e;
        } catch (IOException | ClassNotFoundException i) {
            throw i;
        }
    }
}