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
public class Lesson1_7 {
    public static void main(String[] args) {
        int count1=0, count2=0, count3=0;
        for (int i = 0; i <= 100; i++) {
            if(i%5==0){
                count1++;
            }
            if(i%5==2){
                count2++;
            }
            if(i%10==7){
                count3++;
            }
        }
        System.out.println("There are "+count1+" numbers Divide by 5");
        System.out.println("There are "+count2+" numbers Divide 5 with the remainder 2");
        System.out.println("There are "+count3+" numbers The end digit is “7”");
    }
}
