/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertion;

/**
 *
 * @author Admin
 */
public class Assertion {

    /**
     * @param args the command line arguments
     */
    static int test(int x){
        assert x > 0;
        return (x + 10);
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 5;
//        System.out.println(test(x));
         int x = -5;
        System.out.println(test(x));
    }
    
}
