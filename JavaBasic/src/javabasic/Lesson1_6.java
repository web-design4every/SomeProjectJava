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
public class Lesson1_6 {
    public static void main(String[] args) {
        int i, Number =0, Sum, count=0;
        do{
        Sum = 0 ;
        Number++;
        for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
        if(Sum == i)
        {
            System.out.println(" "+i);
            count++;
        }
    }while(count<5&&Number>0);
    }
}
