/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Flower {
    private String name;
    private double price;
    private String color;

    public Flower() {
    }

    public Flower(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "   " + price + "    " + color;
    }
    
}
class ListFlower {
    List<Flower> u = new ArrayList<Flower>();
    void add() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tmp = 0;
        System.out.println("Enter how many of flower type: ");
        int n = Integer.parseInt(bf.readLine());
        while (tmp<n) {
            System.out.println("Enter name: "); String name = bf.readLine();
            System.out.println("Enter price: "); double price = Double.parseDouble(bf.readLine());
            System.out.println("Enter color: "); String color = bf.readLine();
            u.add(new Flower(name, price, color));
            tmp++;
        }
    }
    void display(){
        for (Flower p: u) {
            System.out.println(p);
        }
    }
    void search(String f) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name to search"); f = bf.readLine();
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i).toString().toUpperCase().contains(f.toUpperCase())) {
                System.out.println(f + " is exits");
            }
        }
    }
    void delete(int poi) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter position to remove"); poi = Integer.parseInt(bf.readLine());
        u.remove(poi);
        for (Flower p: u) {
            System.out.println(p);
        }
    }
    void sort(){
        Collections.sort(u, new Comparator<Flower>() {
            @Override
            public int compare(Flower t, Flower t1) {
                if (t.getPrice()>t1.getPrice()) {
                    return 1;
                }else if (t.getPrice()<t1.getPrice()) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println("Sau khi sap xep tang dan: ");
        for (Flower p: u) {
            System.out.println(p);
        }
    }
}
class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ListFlower t = new ListFlower();
        t.add();
        t.display();
        String f = null;
        t.search(f);
        int poi = 0;
        t.delete(poi);
        t.sort();
    }

}