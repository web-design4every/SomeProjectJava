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
import static ManageCustomer.Manage.showCus;
import ManageProduct.Manager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manage {

    public static void menu() {
        System.out.println("\n1. Input data");
        System.out.println("2. Display order");
        System.out.println("3. sort by pCode + cCode");
        System.out.println("0. exit");
        System.out.println("Your choice: ");
    }

    public static void inputData(MyList<Order> listOr, MyList<Product> listPro, MyList<Customer> listCus) {
        System.out.println("Enter product code: ");
        String pcode = Validation.checkString();
        System.out.println("Enter customer code: ");
        String cCode = Validation.checkString();
        if (!Validation.checkCode(listCus, listPro, cCode, pcode)) {
            System.out.println("Code product or customer not exist!");
            return;
        }
        if (Validation.checkCodeOrder(listOr, pcode, cCode)) {
            System.out.println("This order exist aready!");
            return;
        }
        System.out.println("Enter quantity: ");
        int quantity = Validation.checkInt(0, Integer.MAX_VALUE);
        Order o = new Order(pcode, cCode, quantity);
        listOr.addTail(o);
        System.out.println("Add sucssess!");
    }

    public static void loadDataCus(MyList<Customer> listCus) {
        try {
            FileReader frd = new FileReader("customer.txt");
            BufferedReader brd = new BufferedReader(frd);
            while (brd.ready()) {
                String info = brd.readLine().trim().replaceAll("\\s+", "");
                String listInfo[] = info.split("\\|");
                String code = listInfo[0].trim();
                String name = listInfo[1].trim();
                String phone = listInfo[2].trim();
                Customer c = new Customer(code, name, phone);
                listCus.addTail(c);
            }
            brd.close();
            frd.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(ManageCustomer.Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static MyList readProduct() {
        MyList<Product> listPro = new MyList();
        try {

            FileReader frd = new FileReader("product.txt");
            BufferedReader brd = new BufferedReader(frd);
            while (brd.ready()) {
                String result = brd.readLine().trim().replaceAll("\\s+", " ");

                String[] arr = result.split("\\|");
                //String pCode, String pName, int quantity, int saled, double price
                //pcode = P03, pro_name = Sugar, quantity = 12, saled = 3 and price = 25.1
                //System.out.println(arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3] + "-" + arr[4]);
                //P03 - Sugar - 12 - 3 - 25.1
                String pcode = arr[0];
                String pro_name = arr[1];
                int quantity = Integer.parseInt(arr[2].trim());
                int saled = Integer.parseInt(arr[3].trim());
                double price = Double.parseDouble(arr[4].trim());
                Product p = new Product(pcode, pro_name, quantity, saled, price);
                listPro.addTail(p);
            }
            brd.close();
            frd.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;
    }

    static void displayOr(MyList<Order> listOr) {
        if (listOr.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        for (int i = 0; i < listOr.length(); i++) {
            System.out.println(listOr.get(i));
        }
    }

    static void sortByCode(MyList<Order> listOr) {
        if (listOr.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        for (int i = 0; i < listOr.length() - 1; i++) {
            for (int j = i + 1; j < listOr.length(); j++) {
                if (listOr.get(i).getpCode().compareTo(listOr.get(j).getpCode()) > 0) {
                    Order o = listOr.get(i);
                    listOr.set(i, listOr.get(j));
                    listOr.set(j, o);
                } else if (listOr.get(i).getcCode().compareTo(listOr.get(j).getcCode()) > 0) {
                    Order o = listOr.get(i);
                    listOr.set(i, listOr.get(j));
                    listOr.set(j, o);
                }
            }
        }
        displayOr(listOr);
    }
}
