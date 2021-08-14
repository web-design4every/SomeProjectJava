/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageProduct;

import Entity.Product;
import LinkedList_ASS.MyList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyList<Product> listPro = new MyList<>();
        int choice;
        do {
            Manager.displayMenu1();
            choice = Validation.checkInt(0, 9);
            switch (choice) {
                case 1: {
                    listPro = Manager.readProduct();
                    break;
                }
                case 2:{
                    Manager.addProduct(listPro);
                    break;
                }
                case 3:{
                    Manager.disPlayPro(listPro);
                    break;
                }
                case 4:{
                    Manager.saveIntoFile(listPro);
                    break;
                }
                case 5:{
                    Manager.searchByCode(listPro);
                    break;
                }
                case 6:{
                    Manager.deleteByCode(listPro);
                    break;
                }
                case 7:{
                    Manager.sortByCode(listPro);
                    break;
                }
                case 8:{
                    Manager.addPosK(listPro);
                    break;
                }
                case 9:{
                    Manager.deleAfterXcode(listPro);
                    break;
                }
                case 0:{
                    break;
                }
            }
        } while (choice != 0);
    }
}
