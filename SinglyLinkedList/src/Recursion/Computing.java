/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Computing {

    long gt1(int n) {
        long temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp * i;
        }
        return temp;
    }

    long gt2(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * gt2(n - 1));
    }

    long fibo(int n) {
        if (n < 2) {
            return n;
        }
        return (fibo(n - 1) + fibo(n - 2));
    }

    void reverse() throws IOException {
        char ch = (char) System.in.read();
        if (ch != '\n') {
            reverse();
            System.out.print(ch);
        }
    }

    void tower(int n, char a, char c, char b) {
        if (n == 1) {
            System.out.println("Chuyen 1 dia tu " + a + " sang " + c);
            return;
        }
        tower(n - 1, a, b, c);
        System.out.println("Chuyen 1 dia tu " + a + " sang " + c);
        tower(n - 1, b, c, a);
        return;
    }

    public static void main(String[] args) throws IOException {
        Computing c = new Computing();
        System.out.println(c.gt1(8));
        System.out.println(c.gt2(8));
        System.out.println(c.fibo(3));
        System.out.println("\nEnter a string to be reversed:");
        c.reverse();
        System.out.println("\n");
        char A, B, C;
        A = 'a';
        B = 'b';
        C = 'c';
        c.tower(3, A, C, B);
        // viet chuong trinh cac cach quan hau trong ban co 8 x 8
    }
}
