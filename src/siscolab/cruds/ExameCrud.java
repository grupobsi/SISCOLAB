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
import static siscolab.modelos.Validacao.convertToDateString;
import static siscolab.modelos.Validacao.splitDate;

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
        String dPrazo,dReq,dExec,dResult;
        
        if(cl.getDataPrazo()[1]<10){
            dPrazo = String.format("%d-0%d-", cl.getDataPrazo()[2], cl.getDataPrazo()[1]);
        }
        else{
            dPrazo = String.format("%d-%d-", cl.getDataPrazo()[2], cl.getDataPrazo()[1]);
        }
        if(cl.getDataPrazo()[1]<10){
            dPrazo += String.format("0%d", cl.getDataPrazo()[0]);
        }
        else{
            dPrazo += String.format("%d", cl.getDataPrazo()[0]);
        }
        
        if(cl.getDataRequerimento()[1]<10){
            dReq = String.format("%d-0%d-", cl.getDataRequerimento()[2], cl.getDataRequerimento()[1]);
        }
        else{
            dReq = String.format("%d-%d-", cl.getDataRequerimento()[2], cl.getDataRequerimento()[1]);
        }
        if(cl.getDataRequerimento()[1]<10){
            dReq += String.format("0%d", cl.getDataRequerimento()[0]);
        }
        else{
            dReq += String.format("%d", cl.getDataRequerimento()[0]);
        }
        
        if(cl.getDataExecucao()[1]<10){
            dExec = String.format("%d-0%d-", cl.getDataExecucao()[2], cl.getDataExecucao()[1]);
        }
        else{
            dExec = String.format("%d-%d-", cl.getDataExecucao()[2], cl.getDataExecucao()[1]);
        }
        if(cl.getDataExecucao()[1]<10){
            dExec += String.format("0%d", cl.getDataExecucao()[0]);
        }
        else{
            dExec += String.format("%d", cl.getDataExecucao()[0]);
        }
        
        if(cl.getDataResultado()[1]<10){
            dResult = String.format("%d-0%d-", cl.getDataResultado()[2], cl.getDataResultado()[1]);
        }
        else{
            dResult = String.format("%d-%d-", cl.getDataResultado()[2], cl.getDataResultado()[1]);
        }
        if(cl.getDataResultado()[1]<10){
            dResult += String.format("0%d", cl.getDataResultado()[0]);
        }
        else{
            dResult += String.format("%d", cl.getDataResultado()[0]);
        }
        
        String sql = "INSERT INTO EXAMES (tipo, data_prazo, materia, paciente_fk, medico_fk, reagente, resultado, data_requerimento, data_execucao, data_resultado, estado) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";
        
        sql = String.format(sql, cl.getTipoExame(), dPrazo, cl.getMateria(), cl.getPaciente().getCpf(), cl.getMedico().getCpf(), cl.getReagente(), cl.getResultado(), dReq, dExec, dResult, cl.getEstado());
    
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
            
            String dPrazo,dReq,dExec,dResult;
            dPrazo = convertToDateString(rs.getDate("data_prazo"));
            dReq = convertToDateString(rs.getDate("data_requerimento"));
            dExec = convertToDateString(rs.getDate("data_execucao"));
            dResult = convertToDateString(rs.getDate("data_resultado"));
            int[] dP = splitDate(dPrazo);
            int[] dRq = splitDate(dReq);
            int[] dE = splitDate(dExec);
            int[] dRe = splitDate(dResult);
            
            cl.setDataExecucao(dE);
            cl.setDataPrazo(dP);
            cl.setDataRequerimento(dRq);
            cl.setDataResultado(dRe);
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
        //String tipoExame, int[] dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, Laboratorio laboratorio, int[] dataRequerimento, int[] dataExecucao, int[] dataResultado, String estado
        sql += "UPDATE EXAME set tipo = '%s',\n";
        sql += "materia = '%s',\n";
        sql += "reagente = '%s',\n";
        sql += "resultado = '%s',\n";
        sql += "estado = '%s'\n";
        sql += "WHERE '%s' = '%s'";
        
        sql = String.format(sql, cl.getTipoExame(), cl.getMateria(), cl.getReagente(), cl.getResultado(), cl.getEstado());
        
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
            
            String dPrazo,dReq,dExec,dResult;
            dPrazo = convertToDateString(rs.getDate("data_prazo"));
            dReq = convertToDateString(rs.getDate("data_requerimento"));
            dExec = convertToDateString(rs.getDate("data_execucao"));
            dResult = convertToDateString(rs.getDate("data_resultado"));
            int[] dP = splitDate(dPrazo);
            int[] dRq = splitDate(dReq);
            int[] dE = splitDate(dExec);
            int[] dRe = splitDate(dResult);
            
            cl.setDataExecucao(dE);
            cl.setDataPrazo(dP);
            cl.setDataRequerimento(dRq);
            cl.setDataResultado(dRe);
            
            lst.add(cl);
        }
        
        stmt.close();
        this.fechar();
        
        return lst;
    }
       
}
