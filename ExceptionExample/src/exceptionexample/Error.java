/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Error {
    public static void main(String[] args) throws Exception{
        JOptionPane h = new JOptionPane();
        String s;
        String mess="";
        int k;
        while (true) {            
            s = h.showInputDialog(null, "Enter number: ",mess, JOptionPane.QUESTION_MESSAGE);
            try{
                k = Integer.parseInt(s);
            } catch(Error e) //programmer should never throw or catch errors
            {
                mess = "It is not a valid number, please re-enter";
                continue;
            }
            break;  
        }
        h.showMessageDialog(null, "k = "+ k);
    }
}
