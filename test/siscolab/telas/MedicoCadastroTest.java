/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import siscolab.modelos.Medico;

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
            int x = NovoMedico.getCpfC().getX();
            int y = NovoMedico.getCpfC().getY();
            NovoMedico.getCpfC().setText("");
            Point p = NovoMedico.getLocation();
            robot.mouseMove(p.x + 1 + x, p.y + 1 + y);
            robot.mousePress(0);
            robot.mouseRelease(0);
            for(int i = 0; i < cpf.length(); i++) {
                robot.keyPress(KeyEvent.VK_0);
            }
            //NovoMedico.getCpfC().postActionEvent();
            
            JOptionPane.showMessageDialog(NovoMedico, String.format("%d,%d", p.x + x, p.y + y));
            
            
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
