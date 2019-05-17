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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20171BSI0278
 */
public class PlanoSaudeTest {
    
    public PlanoSaudeTest() {
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
     * Test of getNumero method, of class PlanoSaude.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Date date;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        String expResult = "1234";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao pegar o numero");
    }

    /**
     * Test of setNumero method, of class PlanoSaude.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        Date date;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        String numero = "5678";
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao setar o numero");
    }

    /**
     * Test of getValidade method, of class PlanoSaude.
     */
    @Test
    public void testGetValidade() {
        System.out.println("getValidade");
        Date date;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        Date expResult = date;
        Date result = instance.getValidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao pegar a validade");
    }

    /**
     * Test of setValidade method, of class PlanoSaude.
     */
    @Test
    public void testSetValidade() {
        System.out.println("setValidade");
        Date validade;
        Date date;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "16-05-2018";
            validade = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        instance.setValidade(validade);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao setar a validade");
    }

    /**
     * Test of getEmpresa method, of class PlanoSaude.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        Date date;
         try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        String expResult = "unimed";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao pegar a empresa");
    }

    /**
     * Test of setEmpresa method, of class PlanoSaude.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "não unimed";
        Date date;
         try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("Falha ao setar a empresa");
    }
    
}
