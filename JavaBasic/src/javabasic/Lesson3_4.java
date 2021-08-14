/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Scanner;
import static javabasic.Lesson3_2.isPrimeNumber;

/**
 *
 * @author Admin
 */
public class Lesson3_4 {
    public static boolean isPrimeNumber(int i) {
        for (int j = 2; j < i; j++) {
            {
                if (i % j == 0) {
                    return false;
                }
            }

        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int count1=0, count2=0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])&&array[i]>=2) {
                count1++;
            }else if((!isPrimeNumber(array[i]))&&array[i]>=4){
                count2++;
            }
        }
        System.out.println("Count prime numbers: "+count1);
        System.out.println("Count composite numbers: "+count2);
    }
    
}
