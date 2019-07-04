/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import siscolab.modelos.PlanoSaude;
import static siscolab.modelos.Validacao.convertToDateString;

/**
 *
 * @author PHANTOM
 */
public class PlanoSaudeCrud extends PostgresConn implements ICrud<String, String> {

    public PlanoSaudeCrud(String connString, String user, String pass) throws SQLException {
        super(connString, user, pass);
    }

    @Override
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        PlanoSaude cl = (PlanoSaude) classe;
        String data;
        

        data = String.format("%d-%d-%d", cl.getValidade()[0], cl.getValidade()[1], cl.getValidade()[2]);

        String sql = String.format("INSERT INTO PLANO_SAUDE(numero, validade, empresa) VALUES('%s', '%s', '%s')", cl.getNumero(), data, cl.getEmpresa());
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public HasCrud crudLer(String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        PlanoSaude cl;
        
        String sql = String.format("SELECT * FROM PLANO_SAUDE\nWHERE %s = '%s'", chave, valor);
     
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        cl = new PlanoSaude();
        
        
        while (rs.next()) {
            cl.setNumero(rs.getInt("numero"));
            cl.setEmpresa(rs.getString("empresa"));
            String date = convertToDateString(rs.getDate("validade"));
            cl.setData(date);
        }
        
        stmt.close();
        this.fechar();
        
        return cl;
    }

    @Override
    public void crudAtualizar(HasCrud classe, String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        PlanoSaude cl = (PlanoSaude) classe;
        
        String sql = "";
        
        String data = String.format("%d-%d-%d", cl.getValidade()[0], cl.getValidade()[1], cl.getValidade()[2]);
        
        sql += String.format("UPDATE PLANO_SAUDE set numero = %d,\n", cl.getNumero());
        sql += String.format("empresa = '%s',\n", cl.getEmpresa());
        sql += String.format("validade = '%s'\n", data);
        sql += String.format("WHERE %s = '%s'", chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public void crudRemover(String ch, String val) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        
        String sql = "";        
        sql += String.format("DELETE FROM PLANO_SAUDE\nWHERE %s = %s", ch, val);
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        ArrayList<PlanoSaude> lst = new ArrayList();
        Statement stmt;

        String sql = "SELECT * FROM PLANO_SAUDE";
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
            PlanoSaude p = new PlanoSaude();
            p.setEmpresa(rs.getString("empresa"));
            p.setNumero(rs.getInt("numero"));
            String date = convertToDateString(rs.getDate("validade"));
            p.setData(date);
            lst.add(p);
        }
        
        stmt.close();
        this.fechar();
        
        return lst;
    }
}
