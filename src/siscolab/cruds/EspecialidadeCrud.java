/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;
import java.sql.SQLException;
import siscolab.modelos.Especialidade;
/**
 *
 * @author phantom
 */
public class EspecialidadeCrud extends PostgresConn implements ICrud<Especialidade> {
    
    public EspecialidadeCrud(String connString, String user, String pass) throws Exception {
        super(connString, user, pass);
    }
    
    /**
     *
     * @param especialidade
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @Override
    public void crudCriar(Especialidade especialidade) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("INSERT INTO ESPECIALIDADE (especialidade) VALUES ('%s')", especialidade));
    }

    // Pensar em um jeito de implementar a leitura de classes do banco de dados ...
    @Override
    public Especialidade crudLer(int id) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("SELECT * FROM ESPECIALIDADE\nWHERE id = %d", id));
        return null;
    }

    @Override
    public void crudAtualizar(Especialidade especialidade, int id) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("UPDATE ESPECIALIDADE\nSET especialidade = %s\nWHERE especialidade = %s", especialidade.getEspecialidade(), id));
    }

    @Override
    public void crudRemover(int id) throws SQLException, ClassNotFoundException {
        this.executeQuery(String.format("DELETE FROM ESPECIALIDADE WHERE id = %d", id));
    }
}
