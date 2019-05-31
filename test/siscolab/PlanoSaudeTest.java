/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

import siscolab.modelos.PlanoSaude;
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
            fail("Formato de Data inválido");
            e.printStackTrace();
            return;
        }
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            String dateInString = "7-06-2013";
            date = formatter.parse(dateInString);
        }catch(ParseException e) {
            fail("Formato de Data inválido");
            e.printStackTrace();
            return;
        }
        PlanoSaude instance = new PlanoSaude("1234", date, "unimed");
        instance.setValidade(validade);
    }
}