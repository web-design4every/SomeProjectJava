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


public class Main {

    public static void main(String[] args) {
        MyList<Order> listOr = new MyList<>();
        MyList<Product> listPro = new MyList<>();
        MyList<Customer> listCus = new MyList<>();
        int choice;
        do{
            Manage.menu();
            choice = Validation.checkInt(0, 3);
            switch(choice){
                case 0:{
                    break;
                }
                case 1:{
                    Manage.loadDataCus(listCus);
                    listPro = Manage.readProduct();
                    Manage.inputData(listOr, listPro, listCus);
                    break;
                }
                case 2:{
                    Manage.displayOr(listOr);
                    break;
                }
                case 3:{
                    Manage.sortByCode(listOr);
                    break;
                }
            }
        }while(choice != 0);
    }
}
