/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

import siscolab.modelos.Medico;
import siscolab.modelos.Exames;
import siscolab.modelos.Paciente;
import java.util.Calendar;
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
public class ExamesTest {
    int[] data;
    Exames exame;
    
    @Before
    public void setUp() {
        data = new int[3];
        data[0] = 16;
        data[0] = 05;
        data[0] = 2019;
        
        exame = new Exames();
    }
    
    @Test
    public void testSetDataPrazo(){
        try{
            this.exame.setDataPrazo(data);
            fail("Não deve aceitar data anterior a atual");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}
