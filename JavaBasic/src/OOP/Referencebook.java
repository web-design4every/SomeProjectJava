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
public class Referencebook extends Book{
    double tax;
    public Referencebook() {
    }

    public Referencebook(double tax, String code, Date date, double price, int quantity, String publisher) {
        super(code, date, price, quantity, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public double getAmount(){
        double amount;
        amount = quantity * price + tax;
        money = amount;
        return money;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter tax: ");
        tax=sc.nextDouble();
    }
    
    public void display(){
        super.display();
        System.out.println("Tax: "+tax);
    }
    
}
