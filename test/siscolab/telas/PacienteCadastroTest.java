/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.telas;

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
 * @author Julia
 */
public class PacienteCadastroTest {
    
    public PacienteCadastroTest() {
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
     * Test of main method, of class PacienteCadastro.
     */
    @Test
    public void testMain() {
        PacienteCadastro novoPaciente = new PacienteCadastro();
        
        try{
            try{
                novoPaciente.setCpfC("12345678910");
                validaCpf(novoPaciente.getCpfC().getText());
            }catch(Exception ex){
                fail("deu erro - cpf");
            }
            try{
                int[] dataA = new int[3];
                novoPaciente.setDataNascimentoC("01102000");
                dataA = convertDate(novoPaciente.getDataNascimentoC().getText());
                validaNasc(dataA);
            }catch(Exception ex){
                fail("deu erro - dt nascimento");
            }
            novoPaciente.setMunicipioC("Serra");
            novoPaciente.setNomeC("Maria");
            novoPaciente.setSobrenomeC("Souza");
            novoPaciente.setRgC("321654");//
            try{
                novoPaciente.setEmailC("mari@gmail.com");
                validaEmail(novoPaciente.getEmailC().getText());
            }catch(Exception ex){
                fail("deu erro - cpf");
            }
            novoPaciente.setSenhaC("123456");
            
        }catch (Exception ex){
        
        }
    }
    
}
