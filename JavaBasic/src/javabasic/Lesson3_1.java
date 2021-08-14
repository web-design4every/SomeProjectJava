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
import java.util.Arrays; 
import java.util.Collections; 
  
public class Lesson3_1 { 
    // To do two way sort. First sort even numbers in 
    // ascending order, then odd numbers in descending 
    // order. 
    static void twoWaySort(Integer arr[], int n) 
    { 
        // Current indexes from left and right 
        int l = 0, r = n - 1; 
  
        // Count of odd numbers 
        int k = 0; 
  
        while (l < r) { 
            // Find first odd number from left side. 
            while (arr[l] % 2 != 0) { 
                l++; 
                k++; 
            } 
  
            // Find first even number from right side. 
            while (arr[r] % 2 == 0 && l < r) 
                r--; 
  
            // Swap odd number present on left and even 
            // number right. 
            if (l < r) { 
                // swap arr[l] arr[r] 
                int temp = arr[l]; 
                arr[l] = arr[r]; 
                arr[r] = temp; 
            } 
        } 
  
        // Sort odd number in descending order 
        Arrays.sort(arr, 0, k, Collections.reverseOrder()); 
  
        // Sort even number in ascending order 
        Arrays.sort(arr, k, n); 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        Integer arr[] = { 1, 3, 2, 7, 5, 4 }; 
  
        twoWaySort(arr, arr.length); 
  
        System.out.println(Arrays.toString(arr)); 
    } 
} 