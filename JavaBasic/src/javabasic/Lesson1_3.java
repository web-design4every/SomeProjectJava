/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author Admin
 */
public class Lesson1_3 {
   public static void main(String[] args){
          System.out.println("Print out the screen all prime numbers from 1000 to 2000.");
          for (int i = 1000; i < 2000; i++) {
              if(isPrime(i))
              System.out.println(" "+i);
       }
 }
   public static boolean isPrime(int i){
       for (int j = 2; j < i; j++) {
           if(i % j == 0){
               return false;
           }
       }
       return true;
   }
}
