/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;

/**
 *
 * @author matheus.garcias
 */
public interface ICrud {
    public String crudCriar();
    public String crudLer();
    public String crudAtualizar(String v);
    public String crudRemover();
}
