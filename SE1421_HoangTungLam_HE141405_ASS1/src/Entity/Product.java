/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
public class Product implements Comparable<Product>{
    private String pCode;
    private String pName;
    private int quantity;
    private int saled;
    private double price;

    public Product() {
    }

    public Product(String pCode, String pName, int quantity, int saled, double price) {
        this.pCode = pCode;
        this.pName = pName;
        this.quantity = quantity;
        this.saled = saled;
        this.price = price;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSaled() {
        return saled;
    }

    public void setSaled(int saled) {
        this.saled = saled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code: " + pCode + "\tName: " + pName + "\tQuantity: " + quantity + "\tSaled: " + saled + "\tPrice: " + price;
    }

    @Override
    public int compareTo(Product o) {
        return pCode.compareTo(o.getpCode());
    }
    
}
