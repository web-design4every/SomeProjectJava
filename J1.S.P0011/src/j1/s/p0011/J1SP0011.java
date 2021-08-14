/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

/**
 *
 * @author Admin
 */
public class J1SP0011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    String binary = validate.checkBinary();
                    Menu.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = validate.checkDecimal();
                    Menu.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexadecimal = validate.checkHexaDecimal();
                    Menu.convertFromHexadecimal(hexadecimal);
                    break;
                case 4:
                    return;
        }
    }
    
}
}    
