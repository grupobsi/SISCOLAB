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
import siscolab.modelos.Exame;
import siscolab.modelos.Medico;
import siscolab.modelos.Paciente;

/**
 *
 * @author Lavinia
 */
public class ExameCrud extends PostgresConn implements ICrud<String, String> {

    public ExameCrud(String connString, String user, String pass) throws SQLException {
        super(connString, user, pass);
    }

    @Override
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Exame cl = (Exame) classe;
        
        String sql = "INSERT INTO EXAMES (tipo, data_prazo, materia, paciente_fk, medico_fk, reagente, resultado, data_requerimento, data_execucao, data_resultado, estado) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";
        
        sql = String.format(sql, cl.getTipoExame(), String.format("%d-%d-%d", cl.getDataPrazo()[0], cl.getDataPrazo()[1], cl.getDataPrazo()[2]), cl.getMateria(), cl.getPaciente().getCpf(), cl.getMedico().getCpf(), cl.getReagente(), cl.getResultado(), String.format("%d-%d-%d", cl.getDataRequerimento()[0], cl.getDataRequerimento()[1], cl.getDataRequerimento()[2]), String.format("%d-%d-%d", cl.getDataExecucao()[0], cl.getDataExecucao()[1], cl.getDataExecucao()[2]), String.format("%d-%d-%d", cl.getDataResultado()[0], cl.getDataResultado()[1], cl.getDataResultado()[2]), cl.getEstado());
    
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        this.fechar();
    }

    @Override
    public HasCrud crudLer(String chave, String valor) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Exame cl;
        PacienteCrud pc = new PacienteCrud(this.getConnString(), this.getUser(), this.getPass());
        MedicoCrud mc = new MedicoCrud(this.getConnString(), this.getUser(), this.getPass());
        
        String sql = "SELECT * FROM MEDICO\n";
        sql += "WHERE '%s' = '%s'";
        
        sql = String.format(sql, chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        cl = new Exame();
        
        //String tipoExame, int[] dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, int[] dataRequerimento, int[] dataExecucao, int[] dataResultado, String estado
        while (rs.next()) {
            Medico m = (Medico)mc.crudLer("cpf_fk", rs.getString("medico_fk"));
            Paciente p = (Paciente)pc.crudLer("cpf_fk", rs.getString("paciente_fk"));
            cl.setTipoExame(rs.getString("tipo"));
            cl.setMateria(rs.getString("materia"));
            cl.setMedico(m);
            cl.setPaciente(p);
            cl.setReagente(rs.getString("reagente"));
            cl.setResultado(rs.getString("resultado"));
            cl.setEstado(rs.getString("resultado"));
        }
        
        stmt.close();
        this.fechar();
        
        return cl;
    }

    @Override
    public void crudAtualizar(HasCrud classe, String ch, String val) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        Statement stmt;
        Exame cl = (Exame) classe;
        
        String sql = "";
        
        sql += String.format("UPDATE USUARIO set cpf = %s", cl.getCpf());
        sql += String.format("rg = %s,\n", cl.getRg());
        sql += String.format("nome = '%s',\n", cl.getNome());
        sql += String.format("sobrenome = '%s',\n", cl.getSobrenome());
        sql += String.format("email = %s,\n", cl.getEmail());
        sql += String.format("senha = '%s';", cl.getSenha());
        
        sql += String.format("UPDATE PACIENTE set plano_saude_fk = '%d',\n", cl.getPlanoSaude().getNumero());
        sql += String.format("municipio = '%s',\n", cl.getMunicipioResidencia());
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
        
        String sql = String.format("DELETE FROM EXAME\nWHERE '%s' = '%s'", chave, valor);
        
        this.conectar();
        stmt = this.getConn().createStatement();
        stmt.executeUpdate(sql);
 
        stmt.close();
        this.fechar();
    }

    @Override
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        ArrayList<Exame> lst = new ArrayList();
        Statement stmt;
        
        PacienteCrud pc = new PacienteCrud(this.getConnString(), this.getUser(), this.getPass());
        MedicoCrud mc = new MedicoCrud(this.getConnString(), this.getUser(), this.getPass());

        String sql = "SELECT * FROM MEDICO\n";
        
        this.conectar();
        stmt = this.getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            Exame cl = new Exame();
            Medico m = (Medico)mc.crudLer("cpf_fk", rs.getString("medico_fk"));
            Paciente p = (Paciente)pc.crudLer("cpf_fk", rs.getString("paciente_fk"));
            cl.setTipoExame(rs.getString("tipo"));
            cl.setMateria(rs.getString("materia"));
            cl.setMedico(m);
            cl.setPaciente(p);
            cl.setReagente(rs.getString("reagente"));
            cl.setResultado(rs.getString("resultado"));
            cl.setEstado(rs.getString("resultado"));
            lst.add(cl);
        }
        
        stmt.close();
        this.fechar();
        
        return lst;
    }
       
}
