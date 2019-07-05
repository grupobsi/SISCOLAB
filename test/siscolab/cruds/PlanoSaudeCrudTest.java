/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import siscolab.modelos.PlanoSaude;

/**
 *
 * @author Julia
 */
public class PlanoSaudeCrudTest {

    public PlanoSaudeCrudTest() {
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

    @Test
    public void testCrudCriar() throws Exception {

        try {
            PlanoSaudeCrud planoSaudeCrud = new PlanoSaudeCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
         
            
            try {
                int[] data = {02, 02, 2019};
                PlanoSaude planoSaude = new PlanoSaude(1, data, "unimed");
                planoSaudeCrud.crudCriar(planoSaude);

            } catch (Exception ex) {
                fail("Erro no banco etc");
            }
        } catch (SQLException ex) {
            fail("Não foi possível se conectar com o banco");
        }

    }

    /* Test of crudLer method, of class PlanoSaudeCrud.
     */
    @Test
    public void testCrudLer() throws Exception {
        try {
            PlanoSaudeCrud planoSaudeCrud = new PlanoSaudeCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
            try {
                PlanoSaude planoSaudeLer = new PlanoSaude();
                planoSaudeLer = (PlanoSaude) planoSaudeCrud.crudLer("empresa", "Samp");
            } catch (Exception ex) {
                fail("erro ao tentar comunicação com banco");
            }
        } catch (SQLException ex) {
            fail("Não foi possível se conectar com o banco");
        }
    }

    @Test
    public void testCrudAtualizar() throws Exception {
        try {
            PlanoSaudeCrud planoSaudeCrud = new PlanoSaudeCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
            try {
                int[] data = {11, 12, 2021};
                PlanoSaude planoSaude = new PlanoSaude(3, data, "sao bernardo");
                planoSaudeCrud.crudAtualizar(planoSaude, "numero", "3");

            } catch (Exception ex) {
                fail("Erro no banco etc");
            }
        } catch (SQLException ex) {
            fail("Não foi possível se conectar com o banco");
        }
    }

    @Test
    public void testCrudRemover() throws Exception {
        try {
            PlanoSaudeCrud planoSaudeCrud = new PlanoSaudeCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
            try {
                planoSaudeCrud.crudRemover("numero", "3");

            } catch (Exception ex) {
                fail("Erro no banco ao tentar remover");
            }
        } catch (SQLException ex) {
            fail("Não foi possível se conectar com o banco");
        }

    }
    
    @Test
    public void testCrudListar() throws Exception {
        try {
            PlanoSaudeCrud planoSaudeCrud = new PlanoSaudeCrud("jdbc:postgresql://motty.db.elephantsql.com/bveutvuk", "bveutvuk", "Bjtrmmzo1AuDKY4EtdIBE_aAxlr_78he");
            try {
                List<PlanoSaude> lst = new ArrayList();
                lst = planoSaudeCrud.crudListar();
                System.out.println(lst);

            } catch (Exception ex) {
                fail("Erro ao listar planos de Saude");
                
            }
        } catch (SQLException ex) {
            fail("Não foi possível se conectar com o banco");
        }
    }

}
