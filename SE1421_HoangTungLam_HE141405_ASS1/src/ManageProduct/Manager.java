/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageProduct;

import Entity.Product;
import LinkedList_ASS.MyList;
import LinkedList_ASS.Node;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manager {

    private static String fileName = "";

    public static void displayMenu1() {
        System.out.println("1. Load data from file");
        System.out.println("2. Input & add to the end");
        System.out.println("3. Display data");
        System.out.println("4. Save product list to file");
        System.out.println("5. Search by pcode");
        System.out.println("6. Delete by pcode");
        System.out.println("7. Sort by pcode");
        System.out.println("8. Add after position k");
        System.out.println("9. Delete the node after the node having code = xCode");
        System.out.println("0. Exit");
        System.out.println("Your choice: ");
    }

    public static void displayMenu2() {
        System.out.println("");
    }

    public static MyList readProduct() {
        // By nguyen anh quan
        MyList listPro = new MyList();
        try {
            System.out.println("Enter file name: ");
            fileName = Validation.checkString();
            FileReader frd = new FileReader(fileName);
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
            listPro.traval();
            brd.close();
            frd.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;
    }

    static void writeProIntoFile(Product p) {
        try {
            FileWriter frt = new FileWriter(fileName, true);
            BufferedWriter brt = new BufferedWriter(frt);
            //P03  |  Sugar       |  12   |  3   |  25.1
            brt.write(p.getpCode() + " | " + p.getpName() + " | "
                    + p.getQuantity() + " | " + p.getSaled() + " | " + p.getPrice() + "\n");

            brt.close();
            frt.close();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void addProduct(MyList listPro) {
        System.out.println("Enter product code: ");
        String code = Validation.checkString();
        if (Validation.checkCode(listPro, code)) {
            System.out.println("Code exist aready !");
            return;
        }
        System.out.println("Enter product name: ");
        String name = Validation.checkString();
        System.out.println("Enter quantity: ");
        int quantity = Validation.checkInt(1, Integer.MAX_VALUE);
        System.out.println("Enter saled: ");
        int saled = Validation.checkInt(0, quantity);
        System.out.println("Enter price: ");
        double price = Validation.checkDouble(0, Double.MAX_VALUE);
        Product p = new Product(code, name, quantity, saled, price);
        writeProIntoFile(p);
    }

    public static void disPlayPro(MyList<Product> listPro) {
        if(listPro.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        listPro.traval();
    }

    public static void saveIntoFile(MyList<Product> listPro) {
        System.out.println("Enter file name to save: ");
        String fileN = Validation.checkString();
        File file = new File(fileN);
        try {
            FileWriter frt = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter brt = new BufferedWriter(frt);
            for (int i = 0; i < listPro.length(); i++) {
                Product p = listPro.get(i);
                brt.write(p.getpCode() + " | " + p.getpName() + " | "
                        + p.getQuantity() + " | " + p.getSaled() + " | " + p.getPrice() + "\n");
            }
            brt.close();
            frt.close();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void searchByCode(MyList<Product> listPro) {
        if (listPro.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        System.out.println("Enter code: ");
        String code = Validation.checkString();
        boolean flag = false;
        for (int i = 0; i < listPro.length(); i++) {
            if (listPro.get(i).getpCode().trim().equalsIgnoreCase(code)) {
                System.out.println(listPro.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Not found!");
        }
    }

    public static void writeListIntoFile(MyList<Product> listPro) {
        try {
            FileWriter frt = new FileWriter(fileName);
            BufferedWriter brt = new BufferedWriter(frt);
            //P03  |  Sugar       |  12   |  3   |  25.1
            for (int i = 0; i < listPro.length(); i++) {
                Product p = listPro.get(i);
                brt.write(p.getpCode() + " | " + p.getpName() + " | "
                        + p.getQuantity() + " | " + p.getSaled() + " | " + p.getPrice() + "\n");
            }
            brt.close();
            frt.close();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void deleteByCode(MyList<Product> listPro) {
        if (listPro.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        System.out.println("Enter code: ");
        String code = Validation.checkString();
        boolean flag = false;
        for (int i = 0; i < listPro.length(); i++) {
            if (listPro.get(i).getpCode().trim().equalsIgnoreCase(code)) {
                listPro.remove(listPro.get(i));
                flag = true;
                writeListIntoFile(listPro);
                System.out.println("Delete sucsses");
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found!");
        }
    }

    public static void sortByCode(MyList<Product> listPro) {
        if (!listPro.isEmpty()) {
            for (int i = 0; i < listPro.length(); i++) {
                for (int j = i + 1; j < listPro.length() - 1; j++) {
                    if (listPro.get(i).getpCode().compareTo(listPro.get(j).getpCode()) > 0) {
                        Product p = listPro.get(i);
                        listPro.set(i, listPro.get(j));
                        listPro.set(j, p);
                    }
                }
            }
            disPlayPro(listPro);
            return;
        }
        System.out.println("List empty!");
    }

    static void addPosK(MyList<Product> listPro) {
        if (!listPro.isEmpty()) {
            System.out.println("Enter product code: ");
            String code = Validation.checkString();
            if (Validation.checkCode(listPro, code)) {
                System.out.println("Code exist aready !");
                return;
            }
            System.out.println("Enter product name: ");
            String name = Validation.checkString();
            System.out.println("Enter quantity: ");
            int quantity = Validation.checkInt(1, Integer.MAX_VALUE);
            System.out.println("Enter saled: ");
            int saled = Validation.checkInt(0, quantity);
            System.out.println("Enter price: ");
            double price = Validation.checkDouble(0, Double.MAX_VALUE);
            Product p = new Product(code, name, quantity, saled, price);
            System.out.println("Enter position: ");
            int pos = Validation.checkInt(0, listPro.length() - 1);
            listPro.addPosK(pos, p);
            writeListIntoFile(listPro);
            System.out.println("Add succsess");
            return;
        }
        System.out.println("List empty!");
    }
    //Delete the node after the node having code = xCode
    public static void deleAfterXcode(MyList<Product> listPro){
        if(!listPro.isEmpty()){
            System.out.println("Enter code: ");
            String code = Validation.checkString();
            for(int i = 0; i < listPro.length(); i++){
                if(listPro.get(i).getpCode().trim().equalsIgnoreCase(code)){
                    listPro.remove(listPro.get(i+1));
                    writeListIntoFile(listPro);
                    System.out.println("Delete succsess!");
                    return;
                }
            }
            return;
        }
        System.out.println("Not found");
    }
}
