/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManage;

/**
 *
 * @author Admin
 */
import java.util.*;
import javafx.scene.Node;
class Student{
      String name;
      int age;
    Student() {}
    Student(String name1, int age1){
         name=name1; age=age1;
    }
    void set(String name1, int age1){
         name=name1; age=age1;
    }
    public String toString(){
         String s = name+"  "+age;
         return(s);    
    }
    
   }
public class Student_Manager{
    void inputMany(LinkedList<Student> l){
        int n;
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Name : ");
            name = sc.next();
            System.out.print("Age : ");
            age = sc.nextInt();
            Student st = new Student(name,age);
            l.addLast(st);
        }
    }
    void traverse(LinkedList<Student> l){
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    void searchAge(LinkedList<Student> l,int findage){
        for (int i = 0; i < l.size() ; i++) {
            if(l.get(i).age >= findage){
                System.out.println(l.get(i));
            }
        }
    }
    void searchName(LinkedList<Student> l,String findName){
        for (int i = 0; i < l.size() ; i++) {
            if(l.get(i).name.compareTo(findName) == 0){
                System.out.println(l.get(i));
            }
        }
    }
}
class Manage {
     public static  void main(String [] args)
        {
          LinkedList<Student> l = new LinkedList<>();
          Student_Manager m = new Student_Manager();
          m.inputMany(l);
          m.traverse(l);
          m.searchAge(l, 15);
          m.searchName(l, "Lam");
        }
}
