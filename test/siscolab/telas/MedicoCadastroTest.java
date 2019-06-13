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

/**
 *
 * @author 20171BSI0162
 */
public class MedicoCadastroTest {
    
    public MedicoCadastroTest() {
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
     * Test of main method, of class MedicoCadastro.
     */
    @Test
    public void testMain() {
        MedicoCadastro NovoMedico = new MedicoCadastro();
        
        //validar tamanho
        
        try{
            NovoMedico.setCpfC("nmbnmbmn");
            if (NovoMedico.CpfC.getText().length() < 11){
            
            }
            
        }
        catch(Exception ex){
                
        }
        NovoMedico.setCrmC("123456");
        NovoMedico.setDataNascimentoC("01011990");
        NovoMedico.setEmailC("teste@teste.com");
        NovoMedico.setEspecialidadeC("Pediatra");
        NovoMedico.setMunicipioC("Vitória");
        NovoMedico.setRgC("3774163");
        NovoMedico.setSenhaC("123456");
        NovoMedico.setNomeC("Juliano");
        NovoMedico.setSobrenomeCJ("Silva");
    }
    
}
