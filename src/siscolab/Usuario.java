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
public abstract class Usuario {
    private char[] cpf;
    private char[] rg;
    private String nome;
    private String sobrenome;
    private char[] dataNascimento;
    private String email;
    private String senha;
    
    public Usuario(String cpf, String rg, String nome, String sobrenome, String dataNascimento, String email, String senha) {
        this.cpf = cpf.toCharArray();
        this.rg = rg.toCharArray();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento.toCharArray();
        this.email = email;
        this.senha = senha;
    }
}
