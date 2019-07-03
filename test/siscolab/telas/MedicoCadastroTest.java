/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static siscolab.modelos.Validacao.convertDate;
import static siscolab.modelos.Validacao.validaCpf;
import static siscolab.modelos.Validacao.validaEmail;
import static siscolab.modelos.Validacao.validaNasc;

/**
 *
 * @author 20171BSI0162
 */
public class MedicoCadastroTest {
    
    /*private void type(String s){
        byte[] bytes = s.getBytes();
        for (byte b : bytes)
        {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }*/
    
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
        NovoMedico.setVisible(true);

        try{ //insercao dados
            NovoMedico.setCrmC("123456");
            try{
                NovoMedico.setCpfC("17014541730");
                validaCpf(NovoMedico.getCpfC_s());
            }catch (Exception ex){
                fail("deu erro - cpf");
            }
            try{
                int[] dataA = new int[3];
                NovoMedico.setDataNascimentoC("01011990");
                dataA = convertDate(NovoMedico.getNascC_s());
                validaNasc(dataA);
            }catch (Exception ex){
                fail("deu erro - dt nascimento");
            }
            
            try{
                NovoMedico.setEmailC("teste@gmail.com");
                validaEmail(NovoMedico.getEmailC_s());
            }catch (Exception ex){
                fail("deu erro - email");
            }
            
            NovoMedico.setEspecialidadeC("Pediatra");
            NovoMedico.setMunicipioC("Vitória");
            NovoMedico.setRgC("3774163");
            NovoMedico.setSenhaC("123456");
            NovoMedico.setNomeC("Juliano");
            NovoMedico.setSobrenomeCJ("Silva");
            
        }
        catch(Exception ex){
            fail("deu erro ");
        }
  
    }

    
}
