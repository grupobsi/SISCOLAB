/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

/**
 *
 * @author Julia
 */
public class UsuarioLaboratorio {
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String senha;


    public UsuarioLaboratorio (String nomeFantasia, String cnpj, String email, String senha){
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.email = email;
        this.senha = senha;
    }

    //GETTERS
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }

    //SETTERS
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

}