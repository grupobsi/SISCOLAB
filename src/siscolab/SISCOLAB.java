/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import siscolab.cruds.EspecialidadeCrud;
import siscolab.cruds.MedicoCrud;
import siscolab.cruds.PacienteCrud;
import siscolab.cruds.PlanoSaudeCrud;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Medico;
import siscolab.modelos.Paciente;
import siscolab.modelos.PlanoSaude;
/**
 *
 * @author 20171bsi0456
 */
public class SISCOLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente a = new Paciente();
        PlanoSaude b = new PlanoSaude();
        PacienteCrud c;
        
        int []data1 = new int[3];
        data1[0] = 1;
        data1[1] = 2;
        data1[2] = 2222;
        b.setValidade(data1);
        b.setEmpresa("KDKASJSA");
        b.setNumero(45887);
        
        int []data2 = new int[3];
        data2[0] = 1;
        data2[1] = 2;
        data2[2] = 1998;
        
        a.setCpf("16951782709");
        a.setDataNascimento(data2);
        a.setEmail("cu@kkkk.com");
        a.setMunicipioResidencia("Casa do caralho");
        a.setNome("Matheus");
        a.setSobrenome("Garcias");
        a.setRg("3400648");
        a.setSenha("*******");
        a.setPlanoSaude(b);
        
        try {
            c = new PacienteCrud("jdbc:postgresql://localhost:5432/postgres", "postgres", "banana44");
        } catch (Exception ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        try {
            c.crudCriar(a);
            
            /*List lst = c.crudListar();
            for(int i = 0; i < lst.size(); i++) {
                System.out.println(((PlanoSaude)lst.get(i)).getEmpresa());
            }*/
        
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SISCOLAB.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
    }
    
}
