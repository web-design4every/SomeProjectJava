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
import java.util.Scanner;

public class Lesson3_2 {

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
//Elements in the array are looped one by one using for loop.
        for (int i = 0; i < array.length; i++) {


//All the prime numbers or the numbers that satisfy the if condition are displayed as output. 
            if (isPrimeNumber(array[i])&&array[i]>=2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
