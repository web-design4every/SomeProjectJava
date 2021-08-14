/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Book {
    String code;
    Date date;
    double price;
    int quantity;
    String publisher;
    public double money;

    public Book() {
    }

    public Book(String code, Date date, double price, int quantity, String publisher) {
        this.code = code;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.publisher = publisher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book code:");
        code=sc.nextLine();
        System.out.println("Enter date of entry:");
        String ns=sc.nextLine();
        this.date=chuyenStringDate(ns);
        System.out.println("Enter unit price:");
        price=sc.nextDouble();
        System.out.println("Enter quantity:");
        quantity=sc.nextInt();
        System.out.println("Enter publisher:");
        sc.nextLine();
        publisher=sc.nextLine();
    }

     public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            ns=sdf.parse(str);
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }

    public double getMoney() {
        return money;
    }
    
    
     public void display(){
         System.out.println("Book code: "+code);
         System.out.println("Date of entry: "+date);
         System.out.println("Unit price: "+price);
         System.out.println("Quantity: "+quantity);
         System.out.println("Publisher "+publisher);
     }
    
}
