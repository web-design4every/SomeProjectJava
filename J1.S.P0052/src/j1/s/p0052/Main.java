/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManageEastAsiaCountries meac = new ManageEastAsiaCountries();
        while (true) {
            int choice = meac.menu();
            switch (choice) {
                case 1:
                    meac.inputCountry();
                    break;
                case 2:
                    meac.printCountry();
                    break;
                case 3:
                    meac.searchByName();
                    break;
                case 4:
                    meac.printCountrySorted();
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
