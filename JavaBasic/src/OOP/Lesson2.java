/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list1 = new ArrayList <>();
        ArrayList<Book> list2 = new ArrayList <>();
        while (true) {
            int choice,sum=0,sum2=0,count=0;
            System.out.println("\n========Book Information=========");
            System.out.println("1.Textbook");
            System.out.println("2.Referencebook");
            System.out.println("3.Display list of book");
            System.out.println("4.Calculate the sum of money for each type");
            System.out.println("5.Calculate the average of the unit price of the reference books");
            System.out.println("6.Export textbooks of publisher");
            System.out.println("7.Exit");
            System.out.println("Please enter your choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Textbook t = new Textbook();
                    t.input();
                    t.money();
                    list1.add(t);
                    break;
                case 2:
                    Referencebook r= new Referencebook();
                    r.input();
                    r.getAmount();
                    list2.add(r);
                    break;
                case 3:
                    System.out.println("\nDisplay list of book:");
                    System.out.println("\nTextbook:");
                    for(int i=0; i < list1.size(); i++){
                            list1.get(i).display();
                            System.out.println("");
                    }
                    System.out.println("Referencebook:");
                    for(int i=0; i < list2.size(); i++){
                            list2.get(i).display();
                            System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("\nSum of money of textbook: ");
                    for(int i=0; i < list1.size(); i++){
                          sum+=list1.get(i).getMoney();
                    }
                    System.out.println(sum);
                    System.out.println("Sum of money of Referencebook: ");
                    for(int i=0; i < list2.size(); i++){
                          sum2+=list2.get(i).getMoney();
                    }
                    System.out.println(sum2);
                    break;
                case 5:
                    System.out.println("\nAverage of the unit price of the reference books");
                    for(int i=0; i < list2.size(); i++){
                            sum+=list2.get(i).getPrice();
                            count++;
                    }
                    System.out.println(sum/count);
                    break;
                case 6:
                    System.out.println("\nEnter publisher to export textbooks: ");
                    sc.nextLine();
                    String publisher=sc.nextLine();
                    for(int i=0; i < list1.size(); i++){
                            if(list1.get(i).getPublisher().equalsIgnoreCase(publisher)){
                                 list1.get(i).display();
                            }
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("\nPlease enter again!!!");
            }
          
        }    
    }
}
