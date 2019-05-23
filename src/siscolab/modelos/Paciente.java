/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.util.Date;
/**
 *
 * @author 20171bsi0456
 */
public class Paciente extends Usuario {
    private static final long serialVersionUID = 1L;
    private PlanoSaude planoSaude;
    private String municipioResidencia;
    
    public Paciente(String cpf, String rg, String nome, String sobrenome, Date dataNascimento, String email, String senha, PlanoSaude planoSaude, String municipioResidencia) {
        super(cpf, rg, nome, sobrenome, dataNascimento, email, senha);
        this.planoSaude = planoSaude;
        this.municipioResidencia = municipioResidencia;
    }

    //GETTERS
    
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }
    
    public String getMunicipioResidencia() {
        return municipioResidencia;
    }

    //SETTERS
    
    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public void setMunicipioResidencia(String municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

}
