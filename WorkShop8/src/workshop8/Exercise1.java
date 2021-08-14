/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

/**
 *
 * @author Admin
 */
public class Exercise1 {

    public void importData(String fileName) {
        try {
            //open
            InputStream is = new FileInputStream("word.txt");
            //read
            File f = new File("output.txt");
            FileWriter fw = new FileWriter(f);
            int c;
            while ((c = is.read()) != -1) {
                    c += 3;
                    System.out.print((char) c);
                    fw.write((char) c);
            }
            //close
            is.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Exercise1 imf = new Exercise1();
        imf.importData("word.txt");
    }
}
