/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import siscolab.cruds.EspecialidadeCrud;
import siscolab.cruds.MedicoCrud;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Medico;
/**
 *
 * @author 20171bsi0456
 */
public class SISCOLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MedicoCrud c;
        Medico a;
        Especialidade b = new Especialidade("Médico1");
        int []data = {1, 2, 3};
        //Medico t = new Medico("25123698035", "1234567", "felpé", "garses", data, "asdasjfjaf@a", "cukkk", "d34321as", b, "CUUUUUUUUUxd");
        
        try {
            c = new MedicoCrud("jdbc:postgresql://localhost:5432/postgres", "postgres", "banana44");
        } catch (Exception ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        try {
            //c.crudCriar(t);
            //a = (Medico) c.crudLer("crm", "5555555");
            List lst = c.crudListar();
            for(int i = 0; i < lst.size(); i++) {
                System.out.println(((Medico)lst.get(i)).getNome());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
    }
    
}
