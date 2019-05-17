/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

import java.util.Date;

/**
 *
 * @author 20171bsi0456
 */
public class Laboratorio extends Usuario {
    private int codigo;
    private String municipioAtendimento;
    private String[] planosAtende; 
    
    public Laboratorio(String cpf, String rg, String nome, String sobrenome, Date dataNascimento, String email, String senha, int codigo, String municipioAtendimento, String[] planosAtende) {
        super(cpf, rg, nome, sobrenome, dataNascimento, email, senha);
        this.codigo = codigo;
        this.municipioAtendimento = municipioAtendimento;
        this.planosAtende = planosAtende;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the municipioAtendimento
     */
    public String getMunicipioAtendimento() {
        return municipioAtendimento;
    }

    /**
     * @param municipioAtendimento the municipioAtendimento to set
     */
    public void setMunicipioAtendimento(String municipioAtendimento) {
        this.municipioAtendimento = municipioAtendimento;
    }

    /**
     * @return the planosAtende
     */
    public String[] getPlanosAtende() {
        return planosAtende;
    }

    /**
     * @param planosAtende the planosAtende to set
     */
    public void setPlanosAtende(String[] planosAtende) {
        this.planosAtende = planosAtende;
    }
    
    
    
}
