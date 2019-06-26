/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author phantom
 */
public class EspecialidadeCrud extends PostgresConn implements ICrud {
    
    public EspecialidadeCrud(String connString, String user, String pass) throws Exception {
        super(connString, user, pass);
    } 

    @Override
    public void crudCriar(ICrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICrud crudLer(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crudAtualizar(ICrud classe, int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crudRemover(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
