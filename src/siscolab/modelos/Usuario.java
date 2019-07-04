/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.io.Serializable;
import siscolab.cruds.HasCrud;
import static siscolab.modelos.Validacao.splitDate;
/**
 *
 * @author 20171bsi0456
 */
public abstract class Usuario implements Serializable, HasCrud {
    private static final long serialVersionUID = 1L;
    private String cpf;
    private String rg;
    private String nome;
    private String sobrenome;
    private int[] dataNascimento;
    private String email;
    private String senha;
    
    public Usuario(){}
    
    public Usuario(String cpf, String rg, String nome, String sobrenome, int[] dataNascimento, String email, String senha){
        this.setCpf(cpf);
        this.setRg(rg);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setDataNascimento(dataNascimento);
        this.setEmail(email);
        this.setSenha(senha);
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
    
    public int[] getDataNascimento() {
        return dataNascimento;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }

    //SETTERS
    
    public void setCpf(String cpf){
        String cpf1 = cpf.replaceAll("[^0-9]", "");
        try{
            if(Validacao.validaCpf(cpf1)){
                this.cpf = cpf1;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        } 
    }

    public void setRg(String rg) {
        String rg1 = rg.replaceAll("[^0-9]", "");
        try{
            if(Validacao.validaRg(rg1)){
                this.rg = rg1;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento(int[] dataNascimento){
        try{
            if(Validacao.validaNasc(dataNascimento)){
                this.dataNascimento = dataNascimento;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setEmail(String email){
        try{
            if(Validacao.validaEmail(email)){
                this.email = email;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setData(String date) {
        int[] data = splitDate(date);
        this.dataNascimento = data;
    }
}
   


    