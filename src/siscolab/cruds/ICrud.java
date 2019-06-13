/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

import java.sql.SQLException;

/**
 *
 * @author matheus.garcias
 * @param <Classe>
 */
public interface ICrud <Classe> {
    public void crudCriar(Classe classe) throws SQLException, ClassNotFoundException;
    public Classe crudLer(int id) throws SQLException, ClassNotFoundException;
    public void crudAtualizar(Classe classe, int id) throws SQLException, ClassNotFoundException ;
    public void crudRemover(int id) throws SQLException, ClassNotFoundException ;
}
