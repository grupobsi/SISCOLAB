/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.util.Date;
import java.io.Serializable;
import java.util.Calendar;
/**
 *
 * @author 20171bsi0456
 */
public abstract class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cpf; //Exceção: cpf inválido
    private String rg;
    private String nome;
    private String sobrenome;
    private int[] dataNascimento;
    private String email;
    private String senha;
    
    public Usuario(){}
    
    public Usuario(String cpf, String rg, String nome, String sobrenome, int[] dataNascimento, String email, String senha) throws Exception{
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

    public void setDataNascimento(int[] dataNascimento) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (dataNascimento[0] > dia){
            if (dataNascimento[1] > mes){
                if (dataNascimento[2] > ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (dataNascimento[1] > mes){
                if (dataNascimento[2] > ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (dataNascimento[2] > ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.dataNascimento = dataNascimento;
                }
            }    
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
   


    