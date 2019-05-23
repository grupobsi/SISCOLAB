/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import siscolab.modelos.PersistenciaArquivo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import siscolab.modelos.Exames;

/**
 *
 * @author phantom
 */
public class PersistenciaArquivoTest {
    
    public PersistenciaArquivoTest() {
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
     * Test of salvar method, of class PersistenciaArquivo.
     */
    @Test
    public void testSalvar() {
        
        System.out.println("salvar");
        Object e = new Object();
        String path = "ObjectTest";
        PersistenciaArquivo instance = new PersistenciaArquivo();
        try {
            instance.salvar(e, path);
        } catch(IOException i) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of carregar method, of class PersistenciaArquivo.
     */
    @Test
    public void testCarregar() {
        System.out.println("carregar");
        String path = "ObjectTest";
        PersistenciaArquivo instance = new PersistenciaArquivo();
        Object expResult = new Object();
        Object result;
        try {
            result = instance.carregar(path);
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao carregar...");
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersistenciaArquivoTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao carregar...");
            return;
        }
        
    }
    
}
