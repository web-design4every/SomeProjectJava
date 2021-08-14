/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Tao ThreadB theo cach so 2
 * Extends tu class Thread
 * @author Admin
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            //Tat ca xu ly cua luong ThreadB viet o day
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadB "+i);
            try {
                 Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
