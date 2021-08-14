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
public class Menu {
    public static int menu(){
        System.out.println("\n=======Change base number system=======");
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = validate.checkinput(1, 4);
        return choice;
    }
    public static int display(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert form " + from + " to " + toCase1);
        System.out.println("2. Convert form " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        int result = validate.checkinput(1, 2);
        return result;
    }
    public static void convertFromBinary(String binary) {
        int choice = display("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println(Convert.basetoBase(binary, 2, 10));
                break;
            case 2:
                System.out.println(Convert.basetoBase(binary, 2, 16));
                break;
        }
    }
    public static void convertFromDecimal(String decimal) {
        int choice = display("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println(Convert.basetoBase(decimal, 10, 2));
                break;
            case 2:
                System.out.println(Convert.basetoBase(decimal, 10, 16));
                break;
        }
    }
    public static void convertFromHexadecimal(String hexadecimal) {
        int choice = display("hexadecimal", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println(Convert.basetoBase(hexadecimal, 16, 2));
                break;
            case 2:
                System.out.println(Convert.basetoBase(hexadecimal, 16, 10));
                break;
        }
    }
}
