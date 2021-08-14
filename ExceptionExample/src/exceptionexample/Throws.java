/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Throws {
    int x = 0;
    public void input() throws Exception
    {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        x=h.nextInt();
        if(x<10) throw new Exception();
    }
    public void display(){
        System.out.println("x = "+ x);
    }
    public void testinput(){
        while (true) {            
            try{
                input();
            }catch (Exception e){
                System.out.println("You should enter the value greater than 10: ");
                continue;
            }
            break;
        }
        display();
    }
}
    class main
    {
        public static void main(String[] args) {
             Throws t= new Throws();
             t.testinput();
        }
    }

