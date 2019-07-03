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
        Robot robot;
        
        
        
        try {
            robot = new Robot();
            //validar tamanho
        } catch (AWTException ex) {
            //Logger.getLogger(MedicoCadastroTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Não foi possível criar o robô");
            return;
        }
        
        
        try{ //insercao dados
            NovoMedico.setCrmC("123456");
            NovoMedico.setCpfC("1111111");
            NovoMedico.setDataNascimentoC("01011990");
            NovoMedico.setEmailC("teste@teste.com");
            NovoMedico.setEspecialidadeC("Pediatra");
            NovoMedico.setMunicipioC("Vitória");
            NovoMedico.setRgC("3774163");
            NovoMedico.setSenhaC("123456");
            NovoMedico.setNomeC("Juliano");
            NovoMedico.setSobrenomeCJ("Silva");
            //falat verificacao cpf e outros dadoos
            robot.delay(1000);
            int p_x = (int) NovoMedico.getOk().getLocationOnScreen().getX();
            int p_y = (int) NovoMedico.getOk().getLocationOnScreen().getY();
            robot.delay(1000);
            robot.mouseMove(p_x, p_y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

            robot.delay(1000);
            
        }
        catch(Exception ex){
            fail("deu erro ");
        }
        
        
        
        
        
    }
    
    /*public void type(Robot robot, String s){
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
    
}

/*int p_x = (int) NovoMedico.getRgC().getLocationOnScreen().getX();
            int p_y = (int) NovoMedico.getRgC().getLocationOnScreen().getY();
            robot.delay(50);
            robot.mouseMove(p_x, p_y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);*/