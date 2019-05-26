/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Julia
 */
public class ValidacaoLetras {
    
    public static class SoLetras extends PlainDocument{
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
            super.insertString(offs, str.replaceAll("[^a-zA-Z]", ""), a);
        }
        
        
    }
    
}
