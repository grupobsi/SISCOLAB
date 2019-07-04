/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import siscolab.modelos.Especialidade;
import siscolab.modelos.Medico;
import siscolab.modelos.Paciente;
import siscolab.modelos.PlanoSaude;

/**
 *
 * @author jumrcampos
 */
public class PacienteCrud extends PostgresConn implements ICrud<String, String> {

    public PacienteCrud(String connString, String user, String pass) throws Exception {
        super(connString, user, pass);
    } 
    
    @Override
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Paciente cl = (Paciente) classe;
        Statement stmt;
        
        String sql = String.format("INSERT INTO USUARIO (cpf, rg, nome, sobrenome, nascimento, email, senha) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s');\n", cl.getCpf(), cl.getRg(), cl.getNome(), cl.getSobrenome(), String.format("%d-%d-%d", cl.getDataNascimento()[0], cl.getDataNascimento()[1], cl.getDataNascimento()[2]), cl.getEmail(), cl.getSenha());
        sql += String.format("INSERT INTO PACIENTE (plano_saude_fk, municipio, cpf_fk) VALUES (%d, '%s', %s)", cl.getPlanoSaude().getNumero(), cl.getMunicipioResidencia(), cl.getCpf());
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public HasCrud crudLer(String ch, String val) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Paciente cl = new Paciente();
        PlanoSaudeCrud c = new PlanoSaudeCrud(this.getConnString(), this.getUser(), this.getPass());
        Statement stmt;
        
        String sql = String.format("SELECT * FROM PACIENTE");        
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        
        while (rs.next()) {
            PlanoSaude a = (PlanoSaude) c.crudLer("numero", Integer.toString(rs.getInt("plano_saude_fk")));
            cl.setCpf(rs.getString("cpf_fk"));
            cl.setMunicipioResidencia(rs.getString("municipio"));
            cl.setRg(rs.getString("rg"));
            cl.setNome(rs.getString("nome"));
            cl.setSobrenome(rs.getString("sobrenome"));
            cl.setEmail(rs.getString("email"));
            cl.setSenha(rs.getString("senha"));
            cl.setPlanoSaude(a);
        }
        
        stmt.close();
        this.fechar();
        
        return cl;
    }

    @Override
    public void crudAtualizar(HasCrud classe, String ch, String val) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crudRemover(String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        
        String sql = String.format("DELETE FROM PACIENTE\nWHERE '%s' = '%s'", chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
 
        stmt.close();
        this.fechar();
    }

    @Override
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        ArrayList<Paciente> lst = new ArrayList();
        Statement stmt;
        PlanoSaudeCrud ec = new PlanoSaudeCrud(this.getConnString(), this.getUser(), this.getPass());

        String sql = "SELECT * FROM PACIENTE as m\n";
        sql += "INNER JOIN USUARIO as p on (m.cpf_fk = p.cpf)";
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            PlanoSaude pl = (PlanoSaude) ec.crudLer("numero", Integer.toString(rs.getInt("plano_saude_fk")));
            Paciente cl = new Paciente();
            cl.setCpf(rs.getString("cpf_fk"));
            cl.setPlanoSaude(pl);
            cl.setMunicipioResidencia(rs.getString("municipio"));
            cl.setRg(rs.getString("rg"));
            cl.setNome(rs.getString("nome"));
            cl.setSobrenome(rs.getString("sobrenome"));
            cl.setEmail(rs.getString("email"));
            cl.setSenha(rs.getString("senha"));
        }
        
        stmt.close();
        this.fechar();
        
        return lst;
    }
    
}
