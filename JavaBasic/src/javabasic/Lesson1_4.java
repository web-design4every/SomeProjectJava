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
public class Lesson1_4 {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            if(i%3==0||i%7==0){
                System.out.println(" "+i);
            }
        }
    }
}
