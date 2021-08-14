/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float S=0;
        System.out.println("Enter number N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
             S+=2.0/((i+1)*i);
        }
        System.out.println(S);
    }
}
