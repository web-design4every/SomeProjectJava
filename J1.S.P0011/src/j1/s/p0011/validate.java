/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class validate {
    private static Scanner sc = new Scanner(System.in);
    public static int checkinput(int min, int max){
        while(true){
            try {
                int number = Integer.parseInt(sc.nextLine());
                if(number < min || number > max){
                    throw new NumberFormatException();
                }else{
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range "+min+" - "+max);
                System.out.println("Please enter again");
            }
        }
    }
    public static String checkBinary() {
        System.out.print("Enter number binary: ");
        String num;
        while (true) {
             num = sc.nextLine();
             if (num.matches("[01]+") && !num.startsWith("0")) {
                System.out.println("Correct number :" + num);
                return num;
             }else{
              System.err.println("Please enter binary number");
              System.out.print("Enter again: ");
             }
        }
    }
    public static String checkDecimal(){
        System.out.print("Enter number decimal: ");
        String num;
        while (true) {
             num = sc.nextLine();
             if (num.matches("[0-9]*")&& !num.startsWith("0")) {
                System.out.println("Correct number :" + num);
                return num;
             }else{
              System.err.println("Please enter decimal number");
              System.out.print("Enter again: ");
             }
        }
    }
    public static String checkHexaDecimal(){
        System.out.print("Enter number hexadecimal: ");
        String num;
        while (true) {
             num = sc.nextLine();
             if (num.matches("[0-9A-F]*")&& !num.startsWith("0")) {
                System.out.println("Correct number :" + num);
                return num;
             }else{
              System.err.println("Please enter hexadecimal number");
              System.out.print("Enter again: ");
             }
        }
    }
}
