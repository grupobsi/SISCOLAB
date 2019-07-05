/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import siscolab.cruds.ExameCrud;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Exame;
import siscolab.modelos.Medico;
import siscolab.modelos.Paciente;
import siscolab.modelos.PlanoSaude;

/**
 *
 * @author user
 */
public class ExameCrudTest {
    
    ExameCrud exCrud;  
    PlanoSaudeCrud pCrud;
    EspecialidadeCrud espCrud;
    MedicoCrud medCrud;
    PacienteCrud pacCrud;
    Exame ex1, ex2, ex3;
    ArrayList lista;
    int[] dat1, dat2, dat3;
    Medico med;
    Paciente pac;
    PlanoSaude plano;
    Especialidade esp;
    
    
    @Before
    public void setUp() {
        dat1 = new int[3];
        dat1[0] = 21;
        dat1[1] = 5;
        dat1[2] = 2020;
        
        dat2 = new int[3];
        dat2[0] = 21;
        dat2[1] = 5;
        dat2[2] = 2021;
        
        dat3 = new int[3];
        dat3[0] = 21;
        dat3[1] = 5;
        dat3[2] = 1998;
        
        esp = new Especialidade("Cardiologista");
        
        med = new Medico();
        med.setCpf("16951782709");
        med.setRg("1234567");
        med.setNome("Matheus");
        med.setSobrenome("Garcias");
        med.setDataNascimento(dat3);
        med.setEmail("matheus@gmail.com");
        med.setSenha("12345678");
        med.setCrm("12345678");
        med.setEspecialidade(esp);
        med.setMunicipioAtuacao("Serra");
        
        plano = new PlanoSaude(1, dat2, "Unimed");
        
        pac = new Paciente();
        pac.setCpf("00490716105");
        pac.setRg("3452001");
        pac.setNome("Letícia");
        pac.setSobrenome("Teixeira");
        pac.setDataNascimento(dat3);
        pac.setEmail("leticia@gmail.com");
        pac.setSenha("87654321");
        pac.setPlanoSaude(plano);
        pac.setMunicipioResidencia("Serra");
        
        ex1 = new Exame();
        ex1.setDataExecucao(dat1);
        ex1.setDataPrazo(dat1);
        ex1.setDataRequerimento(dat1);
        ex1.setDataResultado(dat1);
        ex1.setEstado("Em andamento");
        ex1.setMateria("N sei");
        ex1.setMedico(med);
        ex1.setPaciente(pac);
        ex1.setReagente("reag1");
        ex1.setResultado("None");
        ex1.setTipoExame("Sangue");
        
        ex2 = new Exame();
        
        ex3 = new Exame();
        ex3.setDataExecucao(dat2);
        ex3.setDataPrazo(dat2);
        ex3.setDataRequerimento(dat2);
        ex3.setDataResultado(dat2);
        ex3.setEstado("Em andamento");
        ex3.setMateria("N sei");
        ex3.setMedico(med);
        ex3.setPaciente(pac);
        ex3.setReagente("reag1");
        ex3.setResultado("None");
        ex3.setTipoExame("Sangue");
        
        lista = new ArrayList();
    }
    
    public ExameCrudTest() {
        
    }

    @Test
    public void testCrudCriar() throws Exception {
        try {
            pCrud = new PlanoSaudeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
            medCrud = new MedicoCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
            pacCrud = new PacienteCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
            exCrud = new ExameCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
            
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pCrud.crudCriar(plano);
            espCrud.crudCriar(esp);
            medCrud.crudCriar(med);
            pacCrud.crudCriar(pac);
            exCrud.crudCriar(ex1);
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao criar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudLer() throws Exception {
        try {
            exCrud = new ExameCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ex2 = (Exame)exCrud.crudLer("nome","Letícia");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao ler obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudAtualizar() throws Exception {
        try {
            exCrud = new ExameCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            exCrud.crudAtualizar(ex3,"data_execucao","2021-05-21");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao atualizar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudRemover() throws Exception {
        try {
            exCrud = new ExameCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            exCrud.crudRemover("cpf_fk","16951782709");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao remover obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudListar() throws Exception {
        try {
            exCrud = new ExameCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lista = (ArrayList)exCrud.crudListar();
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ExameCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao listar objs do banco de dados");
        }
    }
}
