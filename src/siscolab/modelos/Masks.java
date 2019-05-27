/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Julia
 */
public class Masks {
    
     public static MaskFormatter Mascara(String Mascara, JFormattedTextField campo){
        MaskFormatter F_Mascara;
        try{
            F_Mascara = new MaskFormatter(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter('_'); //Caracter para preencimento 
            F_Mascara.install(campo);
        }
        catch (ParseException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        } 
        return F_Mascara;
 }
}
    
   