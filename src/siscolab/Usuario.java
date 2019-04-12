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
public abstract class Usuario {
    private String cpf;
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
        this.dataNascimento = dataNascimento.toCharArray();
        this.email = email;
        this.senha = senha;
    }

    // Getters

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    // Setters

    public boolean setCpf(String cpf) {
        this.cpf = cpf;
        return true;
    }

    public boolean setRg(String rg) {
        this.rg = rg;
        return true;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }

    public boolean setSobrenome(String sobrenome) {
        return this.sobrenome;
        return true;
    }

    public Date setDataNascimento(Date dataNascimento) {
        this.dataNascimento = data;
        return true;
    }

    public boolean setEmail(String email) {
        this.email = email;
        return true;
    }

    public String setSenha(String senha) {
        this.senha = senha;
        return true;
    }
}
