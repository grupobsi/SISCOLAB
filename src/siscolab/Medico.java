/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

/**
 *
 * @author 20171bsi0456
 */
public class Medico extends Usuario {
    private String crm;
    private String especialidade;
    private String municipioAtuacao;
    
    public Medico(String cpf, String rg, String nome, String sobrenome, String dataNascimento, String email, String senha, String crm, String especialidade, String municipioAtuacao) {
        super(cpf, rg, nome, sobrenome, dataNascimento, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;
        this.municipioAtuacao = municipioAtuacao;
    }
}
