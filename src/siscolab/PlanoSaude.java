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
public class PlanoSaude {
    private String numero;
    private Date validade;
    private String empresa;
    
    public PlanoSaude(String numero, Date validade, String empresa) {
        this.numero = numero;
        this.validade = validade;
        this.empresa = empresa;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
