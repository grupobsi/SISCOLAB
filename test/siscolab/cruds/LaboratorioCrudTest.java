/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import siscolab.modelos.Laboratorio;

/**
 *
 * @author Julia
 */
public class LaboratorioCrudTest {
    LaboratorioCrud labCrud;
    Laboratorio lab1, lab2;
    ArrayList lista;
    int[] dat1, dat2;
    
    public LaboratorioCrudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crudCriar method, of class LaboratorioCrud.
     */
    @Test
    public void testCrudCriar() throws Exception {
        System.out.println("crudCriar");
        HasCrud classe = null;
        LaboratorioCrud instance = null;
        instance.crudCriar(classe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crudLer method, of class LaboratorioCrud.
     */
    @Test
    public void testCrudLer() throws Exception {
        System.out.println("crudLer");
        String ch = "";
        String val = "";
        LaboratorioCrud instance = null;
        HasCrud expResult = null;
        HasCrud result = instance.crudLer(ch, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crudAtualizar method, of class LaboratorioCrud.
     */
    @Test
    public void testCrudAtualizar() throws Exception {
        System.out.println("crudAtualizar");
        HasCrud classe = null;
        String ch = "";
        String val = "";
        LaboratorioCrud instance = null;
        instance.crudAtualizar(classe, ch, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crudRemover method, of class LaboratorioCrud.
     */
    @Test
    public void testCrudRemover() throws Exception {
        System.out.println("crudRemover");
        String chave = "";
        String valor = "";
        LaboratorioCrud instance = null;
        instance.crudRemover(chave, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crudListar method, of class LaboratorioCrud.
     */
    @Test
    public void testCrudListar() throws Exception {
        System.out.println("crudListar");
        LaboratorioCrud instance = null;
        List expResult = null;
        List result = instance.crudListar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
