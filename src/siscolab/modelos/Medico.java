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
public class Medico extends Usuario {
    private static final long serialVersionUID = 1L;
    private String crm; //Exceção: crm inválido
    private Especialidade especialidade;
    private String municipioAtuacao;
    
    public Medico(String cpf, String rg, String nome, String sobrenome, int[] dataNascimento, String email, String senha, String crm, Especialidade especialidade, String municipioAtuacao) throws Exception{
        super(cpf, rg, nome, sobrenome, dataNascimento, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;
        this.municipioAtuacao = municipioAtuacao;
    }

    // Getters

    public String getCrm() {
        return this.crm;
    }

    public Especialidade getEspecialidade() {
        return this.especialidade;
    }
    
    public String getMunicipioAtuacao() {
        return this.municipioAtuacao;
    }

    // Setters

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
    public void setMunicipioAtuacao(String municipioAtuacao) {
        this.municipioAtuacao = municipioAtuacao;
    }
}
