/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageOrder;

import Entity.Customer;
import Entity.Order;
import Entity.Product;
import LinkedList_ASS.MyList;
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

    static boolean checkCode(MyList<Customer> listCus, MyList<Product> listPro, String cCode, String pcode) {
        boolean flagCus = false;
        boolean flagPro = false;
        for (int i = 0; i < listCus.length(); i++) {
            if (listCus.get(i).getcCode().trim().equalsIgnoreCase(cCode)) {
                flagCus = true;
                break;
            }
        }
        for (int i = 0; i < listPro.length(); i++) {
            if (listPro.get(i).getpCode().trim().equalsIgnoreCase(pcode)) {
                flagPro = true;
                break;
            }
        }
        if (flagCus && flagPro) {
            return true;
        }
        return false;
    }

    static boolean checkCodeOrder(MyList<Order> listOr, String pcode, String cCode) {
        for (int i = 0; i < listOr.length(); i++) {
            if (listOr.get(i).getpCode().trim().equalsIgnoreCase(pcode)
                    && listOr.get(i).getcCode().trim().equalsIgnoreCase(cCode)) {
                return true;
            }
        }
        return false;
    }

    
}
