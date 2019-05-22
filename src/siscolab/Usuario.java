/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;
import java.util.Date;
import java.io.Serializable;
/**
 *
 * @author 20171bsi0456
 */
public abstract class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cpf; //Esceção: cpf inválido
    private String rg;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String email;
    private String senha;
    
    public Usuario(String cpf, String rg, String nome, String sobrenome, Date dataNascimento, String email, String senha) {
        this.cpf = cpf;
        this.rg = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    //GETTERS
    
    public String getCpf() {
        return cpf;
    }
    
    public String getRg() {
        return rg;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }

    //SETTERS
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
   


    