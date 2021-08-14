/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageProduct;

import Entity.Product;
import LinkedList_ASS.MyList;
import LinkedList_ASS.Node;
import java.util.List;
import java.util.Scanner;


public class Validation {
    private static final Scanner scanner = new Scanner(System.in);
    public static int checkInt(int min, int max) {
        int result = 0;
        boolean falg = false;
        while (true) {
            if (scanner.hasNextInt()) {
                result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Out of range, please input again");
                    falg = false;
                } else {
                    falg = true;
                }
            } else {
                System.out.println("Enter again, value must be integer number");
                scanner.nextLine();
                falg = false;
            }
            if (falg) {
                return result;
            }
        }
    }
    public static double checkDouble(double min, double max) {
        double result = 0;
        boolean falg = false;
        while (true) {
            if (scanner.hasNextDouble()) {
                result = Double.parseDouble(scanner.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Out of range, please input again");
                    falg = false;
                } else {
                    falg = true;
                }
            } else {
                System.out.println("Enter again, value must be double number");
                scanner.nextLine();
                falg = false;
            }
            if (falg) {
                return result;
            }
        }
    }
    public static String checkString() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty, input again!");
            } else {
                return result;
            }
        }
    }

    public static boolean checkCode(MyList<Product> listPro, String code) {
        for(int i = 0; i < listPro.length(); i++){
            if(listPro.get(i).getpCode().trim().equalsIgnoreCase(code)){
                return true;
            }
        }
        return false;
    }
}
