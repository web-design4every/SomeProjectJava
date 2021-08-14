/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Tester {
    public static void main(String[] args) {
        //Khoi tao ThreadA
        ThreadA a = new ThreadA();
        Thread ta = new Thread(a);
        
        //Khoi tao ThreadB
        ThreadB tb = new ThreadB();
        
        //Khoi tao ThreadC
        Thread tc = new Thread(new Thread()){
          @Override
          public void run(){
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
              }
           for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadC "+i);
            try {
                 Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          }
        };
        //Cho chay
        ta.start();
        tb.start();
        tc.start();
    }
}
