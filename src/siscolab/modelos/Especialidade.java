/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.io.Serializable;
/**
 *
 * @author 20171bsi0456
 */
// TODO: Terminar de implementar essa classe
public class Especialidade implements Serializable {
    private static long serialVersionUID = 1L;
    private String especialidade;


    public Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    
}