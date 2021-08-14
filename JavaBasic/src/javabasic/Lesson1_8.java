/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Lesson1_8 {
    static int smallestDivisor(int n)  
{  
    // if divisible by 2  
    if (n % 2 == 0)  
        return 2;  
  
    // iterate from 3 to sqrt(n)  
    for (int i = 3; i * i <= n; i += 2) {  
        if (n % i == 0)  
            return i;  
    }  
  
    return n;  
}  
  
// Driver Code  
      
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter natural number N: ");
        n = sc.nextInt();
        System.out.println (smallestDivisor(n));  
          
    } 
} 
