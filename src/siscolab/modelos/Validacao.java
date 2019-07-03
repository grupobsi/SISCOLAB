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
import java.util.Calendar;

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
     
    public static boolean validaData(int[] data) throws Exception{
     int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);

        if (data[0] < dia){
            if (data[1] < mes){
                if (data[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        
        else{
            if (data[1] < mes){
                if (data[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (data[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    return true;
                }
            }    
        }
        return false;
    }
    
    public static boolean validaNasc(int[] data) throws Exception{
     int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);

        if (data[0] > dia){
            if (data[1] > mes){
                if (data[2] > ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        
        else{
            if (data[1] > mes){
                if (data[2] > ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (data[2] > ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    return true;
                }
            }    
        }
        return false;
    }
    
    public static boolean validaEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception ("E-mail com formato inválido");
        }
        return true;
    }
    
    public static boolean validaCpf(String cpf) throws Exception{
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
          
            sm = 0;
            peso = 10;
            
            for (i=0; i<9; i++) {              
                num = (int)(cpf.charAt(i) - 48); 
                sm = sm + (num * peso);
                peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)){
                dig10 = '0';
            }
                
            else{
                dig10 = (char)(r + 48);
            }
          
            sm = 0;
            peso = 11;
            
            for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11)){
                dig11 = '0';
            }
            
            else{
                dig11 = (char)(r + 48);
            }
         
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
                return true;
            }
            
            else {
                throw new Exception("CPF Inválido");
            }
        }
    }
}
   