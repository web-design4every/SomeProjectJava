/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;

import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

/**
 *
 * @author Admin
 */

public class WorkShop7 {
        public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        boolean error;
        Scanner nhap = new Scanner(System.in);
        while (true) {
            do{
                try {
                    System.out.println("Enter side a: ");
                    a = nhap.nextInt();
            
                    System.out.println("Enter side b: ");
                    b = nhap.nextInt();
            
                    System.out.println("Enter side c: ");
                    c = nhap.nextInt();
                    error = false;
                }
                catch (InputMismatchException e){
                    System.out.println("Wrong input! Try again!");
                    nhap.next();
                    error = true;
                }
            }while(error);
            try {
              RightTriangle rt = new RightTriangle(a, b, c);
              System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
            System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
            System.out.println("This is not a right triangle");
            }
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = nhap.next().charAt(0);
            if(chon != 'Y')
                break;
        }
    }
}
