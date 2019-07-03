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
 * @param <Chave>
 * @param <Valor>
 */
public interface ICrud <Chave, Valor> {
    public void crudCriar(HasCrud classe) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public HasCrud crudLer(Chave ch, Valor val) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudAtualizar(HasCrud classe, Chave ch, Valor val) throws UnsupportedOperationException, SQLException, ClassNotFoundException;
    public void crudRemover(Chave ch, Valor val) throws UnsupportedOperationException, SQLException, ClassNotFoundException ;
    public List crudListar() throws UnsupportedOperationException, SQLException, ClassNotFoundException;
}
