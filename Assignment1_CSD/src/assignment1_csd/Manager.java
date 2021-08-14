/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_csd;

/**
 *
 * @author Admin
 */
class Product{
String pcode;
    String pro_name;
    int quantity;
    int saled;
    double price;
public Product() {
    }

    public Product(String pcode, String pro_name, int quantity, int saled, double price) {
        this.pcode = pcode;
        this.pro_name = pro_name;
        this.quantity = quantity;
        this.saled = saled;
        this.price = price;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSaled(int saled) {
        this.saled = saled;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
         String s = pcode+"   |  "+pro_name+"  |  "+quantity+"  |  "+saled+"  |  "+price;
         return(s);    
    }    
}
class Customer{
    String ccode;
    String cus_name;
    String phone;
    public Customer() {
    }

    public Customer(String ccode, String cus_name, String phone) {
        this.ccode = ccode;
        this.cus_name = cus_name;
        this.phone = phone;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String toString(){
         String s = ccode+"   |  "+cus_name+"  |  "+phone;
         return(s);    
    }  
}
public class Manager{
    void LoadData1(){
        
    }
}
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
