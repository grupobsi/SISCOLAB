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
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import siscolab.modelos.Especialidade;

/**
 *
 * @author user
 */
public class EspecialidadeCrudTest {
    EspecialidadeCrud espCrud;
    Especialidade esp1, esp2, esp3;
    ArrayList lista;
    
    
    @Before
    public void setUp() {
        esp1 = new Especialidade("Cardiologista");
        esp2 = new Especialidade();
        esp3 = new Especialidade("Clinico Geral");
        lista = new ArrayList();
    }
    
    public EspecialidadeCrudTest() {
        
    }

    @Test
    public void testCrudCriar() throws Exception {
        try {
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            espCrud.crudCriar(esp1);
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao criar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudLer() throws Exception {
        try {
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            esp2 = (Especialidade)espCrud.crudLer("especialidade","Cardiologia");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao ler obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudAtualizar() throws Exception {
        try {
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            espCrud.crudAtualizar(esp3,"especialidade","Clinico Geral");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao atualizar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudRemover() throws Exception {
        try {
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            espCrud.crudRemover("especialidade","Cardiologista");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao remover obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudListar() throws Exception {
        try {
            espCrud = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lista = (ArrayList)espCrud.crudListar();
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EspecialidadeCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao listar objs do banco de dados");
        }
    }
}
