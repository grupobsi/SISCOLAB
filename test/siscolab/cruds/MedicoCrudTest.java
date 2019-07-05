/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import siscolab.cruds.MedicoCrud;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Medico;

/**
 *
 * @author user
 */
public class MedicoCrudTest {
    
    MedicoCrud medCrud;
    Medico med1, med2, med3;
    ArrayList lista;
    Especialidade esp;
    int[] dat1, dat2, dat3;
    
    
    @Before
    public void setUp() {
        dat1 = new int[3];
        dat1[0] = 22;
        dat1[1] = 8;
        dat1[2] = 1999;
        
        dat2 = new int[3];
        dat2[0] = 21;
        dat2[1] = 5;
        dat2[2] = 2020;
        
        dat3 = new int[3];
        dat3[0] = 21;
        dat3[1] = 5;
        dat3[2] = 1998;
        
        esp = new Especialidade("Cardiologista");
        
        med1 = new Medico();
        med1.setCpf("00490716105");
        med1.setRg("3452001");
        med1.setNome("Letícia");
        med1.setSobrenome("Teixeira");
        med1.setDataNascimento(dat1);
        med1.setEmail("leticia@gmail.com");
        med1.setSenha("87654321");
        med1.setCrm("87654321");
        med1.setEspecialidade(esp);
        med1.setMunicipioAtuacao("Serra");
        
        med2 = new Medico();
        
        esp.setEspecialidade("Pediatra");
                
        med3 = new Medico();
        med3.setCpf("01245843060");
        med3.setRg("1235567");
        med3.setNome("Matheus");
        med3.setSobrenome("Garcias");
        med3.setDataNascimento(dat3);
        med3.setEmail("matheus@gmail.com");
        med3.setSenha("12345678");
        med3.setCrm("12345678");
        med3.setEspecialidade(esp);
        med3.setMunicipioAtuacao("Serra");
        
        lista = new ArrayList();
    }
    
    public MedicoCrudTest() {
        
    }

    @Test
    public void testCrudCriar() throws Exception {
        try {
            medCrud = new MedicoCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            medCrud.crudCriar(med1);
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao criar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudLer() throws Exception {
        try {
            medCrud = new MedicoCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            med2 = (Medico)medCrud.crudLer("nome","Letícia");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao ler obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudAtualizar() throws Exception {
        try {
            medCrud = new MedicoCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            medCrud.crudAtualizar(med3,"nome","Letícia");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao atualizar obj no banco de dados");
        }
    }
    
    @Test
    public void testCrudRemover() throws Exception {
        try {
            medCrud = new MedicoCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            medCrud.crudRemover("cpf_fk","35092041072");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao remover obj do banco de dados");
        }
    }
    
    @Test
    public void testCrudListar() throws Exception {
        try {
            medCrud = new MedicoCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
        } catch (Exception ex) {
            fail("Falha ao conectar ao banco de dados");
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lista = (ArrayList)medCrud.crudListar();
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicoCrudTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Falha ao listar objs do banco de dados");
        }
    }
    
}
