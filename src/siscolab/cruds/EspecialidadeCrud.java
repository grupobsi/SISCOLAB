/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;
import java.sql.ResultSet;
import java.sql.SQLException;
import siscolab.modelos.Especialidade;
/**
 *
 * @author phantom
 */
public class EspecialidadeCrud extends PostgresConn {
    
    public EspecialidadeCrud(String connString, String user, String pass) throws Exception {
        super(connString, user, pass);
    }
    
    /**
     *
     * @param especialidade
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void crudCriar(ICrud especialidade) throws SQLException, ClassNotFoundException {
        this.executeUpdate(String.format("INSERT INTO ESPECIALIDADE (especialidade) VALUES ('%s')", ((Especialidade)especialidade).getEspecialidade()));
    }

    // Pensar em um jeito de implementar a leitura de classes do banco de dados ...
    public ICrud crudLer(int id) throws SQLException, ClassNotFoundException {
        Especialidade esp = new Especialidade();
        ResultSet result = this.executeQuery(String.format("SELECT * FROM ESPECIALIDADE\nWHERE id = %d", id));
        esp.setEspecialidade(result.getString("especialidade"));
        return esp;
    }

    public void crudAtualizar(ICrud especialidade, int id) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("UPDATE ESPECIALIDADE\nSET especialidade = %s\nWHERE especialidade = %s", ((Especialidade)especialidade).getEspecialidade(), id));
    }

    public void crudRemover(int id) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("DELETE FROM ESPECIALIDADE\nWHERE id = %d", id));
    }
    
    
}
