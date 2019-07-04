/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import siscolab.modelos.PlanoSaude;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20171BSI0278
 */
public class PlanoSaudeTest {
    int[] dataOk;
    int[] dataFail;
    PlanoSaude plano;
    
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
    public void testSetValidade() {
        System.out.println("setValidade");
        plano = new PlanoSaude();
        try{
            this.plano.setValidade(dataOk);
        }
        catch (Exception ex){
            fail("Não deve aceitar data anterior a atual");
            ex.printStackTrace();
        }
    }
}