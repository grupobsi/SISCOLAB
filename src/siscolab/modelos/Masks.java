/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Julia
 */
public class Masks {
    
    private static MaskFormatter cpfmask;
    
    /**
     *
     * @return
     */
    public static MaskFormatter formatarCampoCPF(){
        try {
            cpfmask = new MaskFormatter("###.###.###-##");
            cpfmask.setPlaceholderCharacter( '_' );
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return cpfmask;
    }
}
    
   