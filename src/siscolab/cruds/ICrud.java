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
    public void crudCriar(ICrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public ICrud crudLer(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudAtualizar(ICrud classe, int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudRemover(int id) throws UnsupportedOperationException, SQLException, ClassNotFoundException ;
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException;
}
