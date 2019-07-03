/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static siscolab.modelos.Validacao.validaEmail;

/**
 *
 * @author Julia
 */
public class LaboratorioCadastroTest {
    
    public LaboratorioCadastroTest() {
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
     * Test of main method, of class LaboratorioCadastro.
     */
    @Test
    public void testMain() { 
        LaboratorioCadastro NovoLaboratorio = new LaboratorioCadastro();
        NovoLaboratorio.setVisible(true);
        
        try{
            NovoLaboratorio.setNomefantasiaC("Laboratório etc");
            NovoLaboratorio.setCnpjC("0000");
            NovoLaboratorio.setMunicipioC("Serra");
            //plano-de-saude
            try{
                NovoLaboratorio.setEmailC("teste@gmail.com");
                validaEmail(NovoLaboratorio.getEmailC().getText());
            }catch (Exception ex){
                fail("deu erro - email");
            }
            NovoLaboratorio.setSenhaC("12345");
        
        }catch(Exception ex){
            fail("deu erro");
        }
    }
    
}
