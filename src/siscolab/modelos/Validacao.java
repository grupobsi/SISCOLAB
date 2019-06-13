/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Julia
 */
public class Validacao {
    
     public static void Mascara(String Mascara, JFormattedTextField campo){
        MaskFormatter F_Mascara;
        try{
            F_Mascara = new MaskFormatter(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter('_'); //Caracter para preencimento 
            F_Mascara.install(campo);
        }
        catch (ParseException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
           
        } 
    }
     
     
     
     public static class SoLetras extends PlainDocument{
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
            super.insertString(offs, str.replaceAll("[^a-zA-Z]", ""), a);
        }
    }
     
     public static class SoNumeros extends PlainDocument{
        
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
            super.insertString(offs, str.replaceAll("[^\\d./_-]", ""), a);
        }
    }
}
   