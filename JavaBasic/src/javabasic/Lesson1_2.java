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
public class Lesson1_2 { 
   public static void main(String[] args){  
        int ct=0,n=0,i=1,j=1;  
        while(n<15){  
            j=1;  
            ct=0;  
        while(j<=i){  
           if(i%j==0)  
           ct++;  
           j++;   
        }  
        if(ct==2){  
            System.out.printf("%d ",i);  
            n++;  
        }
        i++;  
}  
}  
}  

