/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.util.List;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Car {
       String name;
       double price;
       String production;

    public Car() {
    }

    public Car(String name, double price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
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

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return name + "   " + price + "  " + production ;
    }
       
}
class GenericCar <T>{
    List<T>a;

    public GenericCar() {
        a = new ArrayList<T>();
    }

    public GenericCar(List<T> a) {
        this.a = a;
    }
    void add(T x){
        a.add(x);
    }
    
    void display(){
//      for(int i=0;i<a.size();i++) System.out.print(a.get(i) + "  ");
//      System.out.println();
        for (T t : a) {
            System.out.println(t.toString());
        }
    }

    public int getSize() {
        return a.size();
    }
    public boolean checkEmpty(){
        return a.isEmpty();
    }
     void delete(int pos){
        a.remove(pos);
    }
}
class Main 
  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
       double price;
       String production;
       int p;
       GenericCar<Car> t = new GenericCar<>();
        while (true) {            
        System.out.println("\nMenu");
        System.out.println("--------------------------");
        System.out.println("1. Add new car ");
        System.out.println("2. Display all car");
        System.out.println("3. Number car of list ");
        System.out.println("4. CheckEmpty list");
        System.out.println("5. Delete car at position");
        System.out.println("6. Exit");
        System.out.print("Enter your option: ");
        char n;
        while( true){
                n = sc.next().charAt(0);
                if(n >= 49 && n <= 54) break;
                else System.out.println("Please! Re-enter");
            }
        if (n == 49){
            System.out.println("Enter car name: ");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("Enter car price: ");
            price=Double.parseDouble(sc.nextLine());
            System.out.println("Enter car production: ");
            production=sc.nextLine();
            Car c1= new Car(name,price,production);
            t.add(c1);
        }
        if(n == 50){
            t.display();
        }
        if(n == 51){
            System.out.println(t.getSize());
        }
        if(n == 52){
            if(t.checkEmpty()==true){
                  System.out.println("List is empty! ");
            }else{
               System.out.println("List is not empty! ");
             }
        }
        if(n == 53){
            System.out.println("Enter car position to delete in list: ");
            p=sc.nextInt();
            t.delete(p);
        }
        if(n == 54){
            break;
        }
  }
}
}

