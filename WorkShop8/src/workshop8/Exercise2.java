/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop8;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercise2 {

    private String name;
    private int age;
    private int mark;

    public static void main(String[] args) {
        Exercise2 war = new Exercise2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.err.println("-------------------------------------------------");
        System.out.println("1. Add a list of Students");
        System.out.println("2. Loading list of Students");
        System.out.println("3. Exit");
        System.out.println("Your choice: ");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("Enter number of Student to add: ");
                int n = sc.nextInt();
                int a = 0;
                do{
              
                System.out.println("Enter name Sudent :");
                String name = sc.next();
                System.out.println("Enter age Sudent :");
                int age = sc.nextInt();
                System.out.println("Enter mark Sudent :");
                int mark = sc.nextInt();

                war.inputStudent(name, age, mark);
                a++;
                }while(a<n);
                break;
            case 2:
                System.out.println("List student: ");
                System.out.println("------------------" + "\n");
                war.loadListStudent();
                break;
            case 3:
                break;
        }

    }

    public void inputStudent(String name, int age, int mark) {
        try {

            //open
            FileWriter fw = new FileWriter("Student.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            //write

            bw.write("Name: " + name + "\n");
            bw.write("Age: " + age + "\n");
            bw.write("Mark: " + mark + "\n");
            bw.write("-----------------" + "\n");

            bw.flush();
            System.out.println("Done");
            //close
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadListStudent() {
        try {
            //open
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            //read
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
