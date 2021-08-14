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
public class Lesson1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Print to the screen composite numbers < 100: ");
        for (int i = 4; i < 100; i++) {
            if (!isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

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
}
