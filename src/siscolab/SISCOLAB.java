/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author 20171bsi0456
 */
public class SISCOLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String dateInString = "7-Jun-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        Especialidade especialidade = new Especialidade("Pediatria");
        Medico medico = new Medico("16951782709", "3700648", "Matheus", "Garcias", date, "matheus_garcias@hotmail.com", "RUSBÉ KKKKKKKKKK", "666", especialidade, "Serra");
        PersistenciaArquivo <Medico> Persist = new PersistenciaArquivo();
        Persist.salvar(medico, "/home/phantom/"+medico.getCpf());

        Medico test = Persist.carregar("/home/phantom/"+medico.getCpf());
        System.out.println(test.getCpf());
        System.out.println(test.getNome());
        System.out.println(test.getSobrenome());
        System.out.println(test.getCrm());
    }
    
}
