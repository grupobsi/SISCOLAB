/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class UsuarioLaboratorioTest {
    String cnpj, cnpjErro, email;
    UsuarioLaboratorio lab;
    
    @Before
    public void setUp() {
        cnpj = "14.572.457.0001-85";
        cnpjErro = "a";
        email = "exemplo@gmail.com";
    }
    
    @Test
    public void testSetCnpj(){
        lab = new UsuarioLaboratorio();
        try{
            this.lab.setCnpj(cnpj);
        }
        catch (Exception ex){
            fail("CNPJ inválido");
            ex.printStackTrace();
        }
    }
    
    @Test
    public void testSetEmail(){
        lab = new UsuarioLaboratorio();
        try{
            this.lab.setEmail(email);
        }
        catch (Exception ex){
            fail("Email inválido");
            ex.printStackTrace();
        }
    }
}
