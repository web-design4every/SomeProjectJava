/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    double height, width;
    HinhChuNhat(){
    }
    HinhChuNhat(double height, double width)
    {
        this.height = height;
        this.width  = width;
    }
    
    double getArea()
    {
        return (height * width);
    }
   
    double getPerimeter()
    {
        return (2 * (height + width));
    }
    void input()
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Input width of Rectangle: ");
        width=Double.parseDouble(t.nextLine());
        System.out.print("Input height of Rectangle: ");
        height=Double.parseDouble(t.nextLine());
    }
    void display()
    {
        System.out.print("\nArea of rectangle: "+this.getArea()+"\nPerimeter of rectangle: "+this.getPerimeter()+"\n");
    }
     public static void main(String[] args) {
        HinhChuNhat rect = new HinhChuNhat();
        rect.input();
        rect.display();
   }
    
}
