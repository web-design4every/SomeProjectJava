/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

/**
 *
 * @author Admin
 */
public class J1SP0051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            int choice = Menu.mennu();
            switch (choice) {
                case 1:
                    NormalCalculator.normalCalculator();
                    break;
                case 2:
                    BMI.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
