/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageCustomer;

import Entity.Customer;
import LinkedList_ASS.MyList;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        MyList<Customer> listCus = new MyList<>();
        int choice;
        do {
            Manage.showMenu();
            choice = Validation.checkInt(0, 6);
            switch (choice) {
                case 0: {

                    break;
                }
                case 1: {
                    Manage.loadData(listCus);
                    break;
                }
                case 2:{
                    Manage.inputCus(listCus);                    
                    break;
                }
                case 3:{
                    Manage.showCus(listCus);
                    break;
                }
                case 4:{
                    Manage.saveList(listCus);
                    break;
                }
                case 5:{
                    Manage.searchByCode(listCus);
                    break;
                }
                case 6:{
                    Manage.deleByCode(listCus);
                    break;
                }                       
            }
        } while (choice != 0);
    }
}
