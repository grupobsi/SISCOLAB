/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author 20171bsi0456
 */
public class PlanoSaude {
    private String numero;
    private int[] validade; //Exceção: n pode data antes da data atual para setar
    private String empresa;
    
    public PlanoSaude(String numero, int[] validade, String empresa) throws Exception{
        this.setNumero(numero);
        this.setValidade(validade);
        this.setEmpresa(empresa);
    }
    
    //GETTERS
    
    public String getNumero() {
        return this.numero;
    }
    
    public int[] getValidade() {
        return this.validade;
    }
    
    public String getEmpresa() {
        return this.empresa;
    }
    
    //SETTERS
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setValidade(int[] validade) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (validade[0] < dia){
            if (validade[1] < mes){
                if (validade[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (validade[1] < mes){
                if (validade[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (validade[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.validade = validade;
                }
            }    
        }
        this.validade = validade;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
