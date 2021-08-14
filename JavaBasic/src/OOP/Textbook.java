/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Textbook extends Book{
    String status;
    public Textbook() {
    }

    public Textbook(String status, String code, Date date, double price, int quantity, String publisher) {
        super(code, date, price, quantity, publisher);
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
   
    public double money() {
        if(status.equalsIgnoreCase("new")){
            money=quantity*price;
        }
        if(status.equalsIgnoreCase("old")){
            money=quantity*price* 0.5;
        }
        return money;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter status");
        status=sc.nextLine();
    }

    public void display(){
        super.display();
        System.out.println("Status: "+status);
    }
    
    
}
