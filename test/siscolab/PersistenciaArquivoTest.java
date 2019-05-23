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
import siscolab.modelos.GenericClass;

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
        
        System.out.println("Teste PersistenciaArquivo.salvar");
        int one   = 1;
        int two   = 2;
        int three = 3;
        
        GenericClass g = new GenericClass(one, two, three);
        String path = "ObjectTest";
        PersistenciaArquivo<GenericClass> instance = new PersistenciaArquivo();
        
        try {
            instance.salvar(g, path);
        } catch(IOException i) {
            fail("Não foi possível salvar a classe.");
        }
    }

    /**
     * Test of carregar method, of class PersistenciaArquivo.
     */
    @Test
    public void testCarregar() {
        System.out.println("Teste PersistenciaArquivo.carregar");
        int one   = 1;
        int two   = 2;
        int three = 3;
        
        GenericClass g = new GenericClass(one, two, three);
        GenericClass h;
        String path = "ObjectTest";
        PersistenciaArquivo<GenericClass> instance = new PersistenciaArquivo();
        
        try {
            instance.salvar(g, path);
            h = instance.carregar(path);
            if(h.one != one || h.two != two || h.three != three){
                fail("Classe carregada, porém com valores diferentes.");
            }
        } catch(IOException | ClassNotFoundException i) {
            Logger.getLogger(PersistenciaArquivoTest.class.getName()).log(Level.SEVERE, null, i);
            fail("Não foi possível carregar a classe.");
        }
        
    }
    
}
