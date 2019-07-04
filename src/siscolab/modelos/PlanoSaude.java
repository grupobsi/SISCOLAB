/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.sql.Date;
import siscolab.cruds.HasCrud;
import static siscolab.modelos.Validacao.splitDate;

/**
 *
 * @author 20171bsi0456
 */
public class PlanoSaude implements HasCrud{
    private int numero;
    private int[] validade; //Exceção: n pode data antes da data atual para setar
    private String empresa;
    
    public PlanoSaude(){}
    
    public PlanoSaude(int numero, int[] validade, String empresa){
        this.setNumero(numero);
        this.setValidade(validade);
        this.setEmpresa(empresa);
    }
    
    //GETTERS
    
    public int getNumero() {
        return this.numero;
    }
    
    public int[] getValidade() {
        return this.validade;
    }
    
    public String getEmpresa() {
        return this.empresa;
    }
    
    //SETTERS
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValidade(int[] validade){
        try{
            if(Validacao.validaData(validade)){
                this.validade = validade;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setData(Date date) {
        this.validade[0] = 1;
        
    }

    public void setData(String date) {
        int[] data = splitDate(date);
        this.validade = data;
    }

}

