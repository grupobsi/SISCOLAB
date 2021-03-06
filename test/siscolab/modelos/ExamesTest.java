/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import siscolab.modelos.Medico;
import siscolab.modelos.Exame;
import siscolab.modelos.Paciente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20171BSI0278
 */
public class ExamesTest {
    int[] dataOk;
    int[] dataFail;
    Exame exame;
    
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
        exame = new Exame();
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
        exame = new Exame();
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
        exame = new Exame();
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
        exame = new Exame();
        try{
            this.exame.setDataResultado(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }
    
}
