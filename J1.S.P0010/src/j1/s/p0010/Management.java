/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Management {
    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public int linearSearch(int[] arr,int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public void displayLinearSearch(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter search value:");
        int search = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }

        System.out.print("The array: ");
        displayArray(array);

        int foundIndex = linearSearch(array,search);
        if (foundIndex==-1) {
            System.out.println("\nCan't found " +search+" in array");
        }else
        System.out.println("\nFound " + search + " at index: " + foundIndex);
    }
}
