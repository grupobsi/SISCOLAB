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
 * @author matheus.garcias
 */
public interface ICrud {
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public HasCrud crudLer(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudAtualizar(HasCrud classe, int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudRemover(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException ;
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException;
}
