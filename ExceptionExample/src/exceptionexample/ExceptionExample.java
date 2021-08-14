/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;
 
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
//            System.out.println(1/0);
            System.out.println("\n\n This command following the error command so it will bi passed");
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("\n There is a detail or error");
            e.printStackTrace();
        }
        System.out.println("exceptionexample.ExceptionExample.main()");
    }
    
}

