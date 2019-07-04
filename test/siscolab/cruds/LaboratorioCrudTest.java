/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Laboratorio;

/**
 *
 * @author Julia
 */
public class LaboratorioCrudTest {
    LaboratorioCrud labCrud;
    Laboratorio lab1, lab2, lab3;
    ArrayList lista;
    String[] planos;
    
    public LaboratorioCrudTest() {
    }
    
    @Before
    public void setUp() throws Exception {
        planos = new String[1];
        planos[0] = "Unimed";
        
        lab1 = new Laboratorio();
        lab1.setCnpj("03837502000160");
        lab1.setEmail("lab1@gmail.com");
        lab1.setMunicipioAtendimento("Serra");
        lab1.setNomeFantasia("BioClinico");
        lab1.setPlanosAtende(planos);
        lab1.setSenha("1234");
        
        lab2 = new Laboratorio();
        
        lab3 = new Laboratorio();
        lab3.setCnpj("78659174000158");
        lab3.setEmail("lab3@gmail.com");
        lab3.setMunicipioAtendimento("Vitória");
        lab3.setNomeFantasia("Tomazi");
        lab3.setPlanosAtende(planos);
        lab3.setSenha("4321");
    }

    @Test
    public void testCrudCriar() throws Exception {
        try {
            labCrud = new LaboratorioCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            labCrud.crudCriar(lab1);
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao criar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudLer() throws Exception {
        try {
            labCrud = new LaboratorioCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lab2 = (Laboratorio)labCrud.crudLer("municipio","Serra");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao ler obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudAtualizar() throws Exception {
        try {
            labCrud = new LaboratorioCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            labCrud.crudAtualizar(lab3,"municipio","Serra");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao atualizar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudRemover() throws Exception {
        try {
            labCrud = new LaboratorioCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            labCrud.crudRemover("municipio","Serra");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao remover obj do banco de dados");
        }
    }
    
    //@Test
    /*public void testCrudListar() throws Exception {
        try {
            labCrud = new LaboratorioCrud("jdbc:postgresql://localhost:5432/SISCOLAB", "postgres", "1234rere");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lista = (ArrayList)labCrud.crudListar();
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LaboratorioCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao listar objs do banco de dados");
        }
    }*/
    
}
