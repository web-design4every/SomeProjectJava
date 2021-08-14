/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tao ThreadA theo cach 1
 * Implement tu 1 interface Runnable
 * @author Admin
 */
public class ThreadA implements Runnable{

    @Override
    public void run() {
       //Tat ca xu ly cua luong ThreadA viet o day
        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadA "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
