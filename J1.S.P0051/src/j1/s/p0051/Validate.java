/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Validate {
    private static final Scanner in = new Scanner(System.in);
    public static int checkInput(int min, int max) {
        while (true) {
            try {
                int number = Integer.parseInt(in.nextLine().trim());
                if (number < min || number > max) {
                    throw new NumberFormatException();
                }else{
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input number in " + min + " - " + max);
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double number = Double.parseDouble(in.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputOperator() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }

}
