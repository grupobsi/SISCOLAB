/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
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
        NovoMedico.setVisible(true);
        Robot robot;
        String cpf = "17014547130";
        try {
            robot = new Robot();
            //validar tamanho
        } catch (AWTException ex) {
            //Logger.getLogger(MedicoCadastroTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Não foi possível criar o robô");
            return;
        }
        
        try{
            int p_x = (int) NovoMedico.getCpfC().getLocationOnScreen().getX();
            int p_y = (int) NovoMedico.getCpfC().getLocationOnScreen().getY();
            robot.delay(1000);
            robot.mouseMove(p_x, p_y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            //robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
           
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_7);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_4);
            
             
            
            robot.delay(1000);
            //NovoMedico.getCpfC().postActionEvent();
            
            JOptionPane.showMessageDialog(NovoMedico, String.format("%d,%d", p_x, p_y));
            
        }
        catch(Exception ex){
            System.out.println("deu erro ");
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
