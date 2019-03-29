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
public class Laboratorio extends Usuario {
    private int codigo;
    private String municipioAtendimento;
    private String[] planosAtende; 
    
    public Laboratorio(String cpf, String rg, String nome, String sobrenome, String dataNascimento, String email, String senha, int codigo, String municipioAtendimento, String[] planosAtende) {
        super(cpf, rg, nome, sobrenome, dataNascimento, email, senha);
        this.codigo = codigo;
        this.municipioAtendimento = municipioAtendimento;
        this.planosAtende = planosAtende;
    }
}
