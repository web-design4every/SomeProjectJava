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
public class Lesson2_2 {
    public static void main(String[] args) {
        int n,x,gt=1;
        float s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        n=sc.nextInt();
        System.out.println("Nhap x: ");
        x=sc.nextInt();
        for(int i=1; i<=n; i++){
            gt=gt*i;
            s+=1.0/gt;
        }
        s=(float) (s+Math.pow(x,2015));
        System.out.println(s);
    }
}
