/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageCustomer;

import Entity.Customer;
import LinkedList_ASS.MyList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manage {

    static String fileName = "";

    public static void showMenu() {
        System.out.println("\n1. Load data from file");
        System.out.println("2. Input and add to the end");
        System.out.println("3. Display data");
        System.out.println("4. Save customer list to file");
        System.out.println("5. Search by cCode");
        System.out.println("6. Delete by code");
        System.out.println("0. Exit");
        System.out.println("Your choice: ");
    }

    public static void showCus(MyList<Customer> listCus) {
        if (listCus.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < listCus.length(); i++) {
            System.out.println(listCus.get(i));
        }
    }

    public static void loadData(MyList<Customer> listCus) {
        System.out.println("Enter file name: ");
        fileName = Validation.checkString();
        try {
            FileReader frd = new FileReader(fileName);
            BufferedReader brd = new BufferedReader(frd);
            while (brd.ready()) {
                String info = brd.readLine().trim().replaceAll("\\s+", "");
                String listInfo[] = info.split("\\|");
                String code = listInfo[0];
                String name = listInfo[1];
                String phone = listInfo[2];
                Customer c = new Customer(code, name, phone);
                listCus.addTail(c);
            }
            showCus(listCus);
            brd.close();
            frd.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void inputCus(MyList<Customer> listCus) {
        System.out.println("Enter code: ");
        String code = Validation.checkString();
        if (Validation.checkCode(listCus, code)) {
            System.out.println("This code exist aready!");
            return;
        }
        System.out.println("Enter name: ");
        String name = Validation.checkString();
        System.out.println("Enter phone: ");
        String phone = Validation.checkString();
        Customer c = new Customer(code, name, phone);
        listCus.addTail(c);
        saveListCustomer(listCus);
        System.out.println("Add success!");
    }

    public static void saveListCustomer(MyList<Customer> listCus) {
        if (!listCus.isEmpty()) {
            try {
                FileWriter frt = new FileWriter(fileName);
                BufferedWriter bft = new BufferedWriter(frt);
                for (int i = 0; i < listCus.length(); i++) {
                    bft.write(listCus.get(i).getcCode() + "|" + listCus.get(i).getcName() + "|" + listCus.get(i).getPhone() + "\n");
                }
                bft.close();
                frt.close();
            } catch (IOException ex) {
                Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
    }

    static void saveList(MyList<Customer> listCus) {
        if (!listCus.isEmpty()) {
            System.out.println("Enter file name: ");
            String fName = Validation.checkString();
            File f = new File(fName);

            try {
                FileWriter frt = new FileWriter(f);
                BufferedWriter bft = new BufferedWriter(frt);
                for (int i = 0; i < listCus.length(); i++) {
                    bft.write(listCus.get(i).getcCode() + "|" + listCus.get(i).getcName() + "|" + listCus.get(i).getPhone() + "\n");
                }
                System.out.println("Save succsess");
                bft.close();
                frt.close();
            } catch (IOException ex) {
                Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        System.out.println("List is empty");
    }

    public static void searchByCode(MyList<Customer> listCus) {
        if(!listCus.isEmpty()){
            System.out.println("Enter code to search: ");
            String code = Validation.checkString();
            for(int i = 0; i < listCus.length(); i++){
                if(listCus.get(i).getcCode().trim().equalsIgnoreCase(code)){
                    System.out.println(listCus.get(i));
                    return;
                }
            }
            System.out.println("Not found");
        }
        System.out.println("List is empty");
    }
    public static void deleByCode(MyList<Customer> listCus){
        if(!listCus.isEmpty()){
            System.out.println("Enter code: ");
            String code = Validation.checkString();
            for(int i = 0; i < listCus.length(); i++){
                if(listCus.get(i).getcCode().trim().equalsIgnoreCase(code)){
                    listCus.remove(listCus.get(i));
                    saveListCustomer(listCus);
                    System.out.println("Delete succsess!");
                    return;
                }
            }
            System.out.println("Not found");
        }
        System.out.println("List is empty");
    }
}
