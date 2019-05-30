/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.io.Serializable;
import siscolab.cruds.ICrud;
/**
 *
 * @author 20171bsi0456
 */
// TODO: Terminar de implementar essa classe
public class Especialidade implements Serializable, ICrud {
    private static long serialVersionUID = 1L;
    private String especialidade;


    public Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String crudCriar() {
        return String.format("INSERT INTO ESPECIALIDADE (especialidade) VALUES ('%s')", this.especialidade);
    }

    @Override
    public String crudLer() {
        return String.format("SELECT %s FROM ESPECIALIDADE", this.especialidade);
    }

    @Override
    public String crudAtualizar(String v) {
        return String.format("UPDATE ESPECIALIDADE\nSET especialidade = %s\nWHERE especialidade = %s", v, this.especialidade);
    }

    @Override
    public String crudRemover() {
        return String.format("DELETE FROM ESPECIALIDADE WHERE especialidade = %s", this.especialidade);
    }
    
    
}
