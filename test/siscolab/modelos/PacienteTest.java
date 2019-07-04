/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author user
 */
public class PacienteTest {
    String rg;
    Paciente paciente;
    
    @Before
    public void setUp(){
        rg = "123a456789a";
    }
    
    @Test
    public void testSetRg(){
        paciente = new Paciente();
        try{
            this.paciente.setRg(rg);
        }
        catch (Exception ex){
            fail("RG inválido");
            ex.printStackTrace();
        }
    }
    
    
}
