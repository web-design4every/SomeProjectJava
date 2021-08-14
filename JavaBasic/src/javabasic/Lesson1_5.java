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
public class Lesson1_5 {
    public static void main(String[] args) {
        System.out.println("Print out the screen the numbers between 100 and 200 and divide by 3, 5, 7.");
        for (int i = 100; i < 200; i++) {
            if (i%3==0||i%5==0||i%7==0) {
                System.out.println(" "+i);
            }
        }
    }
}
