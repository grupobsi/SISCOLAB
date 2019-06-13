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
    int[] dataOk;
    int[] dataFail;
    Exames exame;
    
    @Before
    public void setUp() {
        dataOk = new int[3];
        dataOk[0] = 16;
        dataOk[1] = 07;
        dataOk[2] = 2022;
        
        dataFail = new int[3];
        dataFail[0] = 01;
        dataFail[1] = 01;
        dataFail[2] = 2001;
    }
    
    @Test
    public void testSetDataPrazo(){
        exame = new Exames();
        try{
            this.exame.setDataPrazo(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }
    
    @Test
    public void testSetDataRequerimento(){
        exame = new Exames();
        try{
            this.exame.setDataRequerimento(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }
    
    @Test
    public void testSetDataExecucao(){
        exame = new Exames();
        try{
            this.exame.setDataExecucao(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }

    @Test
    public void testSetDataResultado(){
        exame = new Exames();
        try{
            this.exame.setDataResultado(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }
    
}
