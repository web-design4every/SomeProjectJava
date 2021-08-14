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
public class Lesson1_9 {
    private static Scanner scanner = new Scanner(System.in);
     
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter natural number N: ");
        int n = scanner.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        // in kết quả ra màn hình
        System.out.printf("Result: %d = ", n);
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.println(listNumbers.get(size - 1));
    }
    
    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        // phân tích
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
}
