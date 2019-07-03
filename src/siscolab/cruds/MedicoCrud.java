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
import siscolab.modelos.Medico;
import siscolab.cruds.EspecialidadeCrud;
import siscolab.modelos.Especialidade;

/**
 *
 * @author PHANTOM
 */
public class MedicoCrud extends PostgresConn implements ICrud<String, String> {
    
    public MedicoCrud(String connString, String user, String pass) throws Exception {
        super(connString, user, pass);
    } 

    @Override
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Medico cl = (Medico) classe;
        
        String sql = String.format("INSERT INTO USUARIO (cpf, rg, nome, sobrenome, nascimento, email, senha) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s');\n", cl.getCpf(), cl.getRg(), cl.getNome(), cl.getSobrenome(), String.format("%d-%d-%d", cl.getDataNascimento()[0], cl.getDataNascimento()[1], cl.getDataNascimento()[2]), cl.getEmail(), cl.getSenha());
        sql += String.format("INSERT INTO MEDICO (crm, especialidade_fk, municipio, cpf_fk) VALUES ('%s', '%s', '%s', '%s')", cl.getCrm(), cl.getEspecialidade().getEspecialidade(), cl.getMunicipioAtuacao(), cl.getCpf());
    
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public HasCrud crudLer(String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Medico cl;
        EspecialidadeCrud ec = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/postgres", "postgres", "banana44");
        
        String sql = "SELECT * FROM MEDICO as m\n";
        sql += String.format("INNER JOIN USUARIO as u on (m.cpf_fk = u.cpf)\n");
        sql += String.format("WHERE %s = '%s'", chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        cl = new Medico();
        
        
        while (rs.next()) {
            Especialidade esp = (Especialidade) ec.crudLer("especialidade", rs.getString("especialidade_fk"));
            cl.setCpf(rs.getString("cpf_fk"));
            cl.setCrm(rs.getString("crm"));
            cl.setEspecialidade(esp);
            cl.setMunicipioAtuacao(rs.getString("municipio"));
            cl.setRg(rs.getString("rg"));
            cl.setNome(rs.getString("nome"));
            cl.setSobrenome(rs.getString("sobrenome"));
            cl.setEmail(rs.getString("email"));
            cl.setSenha(rs.getString("senha"));
        }
        
        stmt.close();
        this.fechar();
        
        return cl;
    }

    @Override
    public void crudAtualizar(HasCrud classe, String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Medico cl = (Medico) classe;
        
        String sql = "";
        
        sql += String.format("UPDATE USUARIO set cpf = %s", cl.getCpf());
        sql += String.format("rg = %s,\n", cl.getRg());
        sql += String.format("nome = '%s',\n", cl.getNome());
        sql += String.format("sobrenome = '%s',\n", cl.getSobrenome());
        sql += String.format("email = %s,\n", cl.getEmail());
        sql += String.format("senha = '%s';", cl.getSenha());
        
        sql += String.format("UPDATE MEDICO set crm = '%s',\n", cl.getCrm());
        sql += String.format("municipio = '%s',\n", cl.getMunicipioAtuacao());
        sql += String.format("especialidade_fk = '%s',\n", cl.getEspecialidade().getEspecialidade());
        sql += String.format("cpf_fk = %s", cl.getCpf());
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public void crudRemover(String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        
        String sql = String.format("DELETE FROM MEDICO\nWHERE '%s' = '%s'", chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
 
        stmt.close();
        this.fechar();
    }

    @Override
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        ArrayList<Medico> lst = new ArrayList();
        Statement stmt;
        EspecialidadeCrud ec = new EspecialidadeCrud("jdbc:postgresql://localhost:5432/postgres", "postgres", "banana44");

        String sql = "SELECT * FROM MEDICO as m\n";
        sql += "INNER JOIN USUARIO as p on (m.cpf_fk = p.cpf)";
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
            Especialidade esp = (Especialidade) ec.crudLer("especialidade", rs.getString("especialidade_fk"));
            Medico cl = new Medico();
            cl.setCpf(rs.getString("cpf"));
            cl.setCrm(rs.getString("crm"));
            cl.setEspecialidade(esp);
            cl.setMunicipioAtuacao(rs.getString("municipio"));
            cl.setRg(rs.getString("rg"));
            cl.setNome(rs.getString("nome"));
            cl.setSobrenome(rs.getString("sobrenome"));
            cl.setEmail(rs.getString("email"));
            cl.setSenha(rs.getString("senha"));
            lst.add(cl);
        }
        
        stmt.close();
        this.fechar();
        
        return lst;
    }
}
