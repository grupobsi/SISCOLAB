/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.util.Date;
import java.io.Serializable;
import java.util.Calendar;
import java.util.InputMismatchException;
/**
 *
 * @author 20171bsi0456
 */
public abstract class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cpf;
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
    
    public void setCpf(String cpf) throws Exception{
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
           (cpf.length() != 11)){
            throw new Exception("CPF Inválido");
        }
        else{
            char dig10, dig11;
            int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(cpf.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);
         
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
                this.cpf = cpf;
            }
            else {
                throw new Exception("CPF Inválido");
            }
        } 
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

    public void setEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception ("E-mail com formato inválido");
        }
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
   


    