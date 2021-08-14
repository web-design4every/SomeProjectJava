/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class Lesson1_10 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter natural number N: ");
        int n = sc.nextInt();
         List<Integer> listNumbers = primeDivisors(n);
        // in kết quả ra màn hình
        System.out.printf("Result: ");
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " , ");
        }
        System.out.println(listNumbers.get(size - 1));
    }
   
    public static List<Integer> primeDivisors(int n){
        List<Integer> listNumbers = new ArrayList<Integer>();
        if (n % 2 == 0)  
           listNumbers.add(2);
  
    // iterate from 3 to sqrt(n)  
     for (int i = 3; i * i <= n; i += 2) {  
        if (n % i == 0)  
            listNumbers.add(i);
    }  
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
    
}
