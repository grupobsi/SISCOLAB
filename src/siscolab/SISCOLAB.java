/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import siscolab.cruds.EspecialidadeCrud;
import siscolab.modelos.Especialidade;
/**
 *
 * @author 20171bsi0456
 */
public class SISCOLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EspecialidadeCrud c;
        Especialidade a;
        
        try {
            c = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/matheus", "matheus", "C2012#KXy");
        } catch (Exception ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        try {
            a = (Especialidade) c.crudLer(3);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        System.out.println(a.getEspecialidade());
    }
    
}
