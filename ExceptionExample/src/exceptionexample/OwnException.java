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
public class OwnException extends Exception{
    public OwnException(String s){
        super(s);
    }
}
class Test
{
    int x = 0;
    public void input() throws OwnException
    {
        Scanner h = new Scanner(System.in);
        try{
            System.err.println("Enter a value greater than 10: ");
            x = h.nextInt();
            if( x < 10 ) throw new OwnException("Wrong value");
            x = 100;
        }
        catch (OwnException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void dispaly(){
        System.err.println("x = "+x);
    }
}

class Main{
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.input();
        }
        catch (Exception e){
        }
        t.dispaly();
    }
}
