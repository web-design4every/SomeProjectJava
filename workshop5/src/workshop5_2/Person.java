package workshop5_2;
import java.util.*;
abstract class Person {
    public String name;
    public Person(){
    }
    public Person(String name) {
            this.name = name;
    }
    void display(){
            System.out.println(name);
    }
    abstract double getSalary();
}
class Officer extends Person{
    public double bSalary;
    public Officer (){
    }
    public Officer(String name,double bSalary) {
            super(name);
            this.bSalary = bSalary;
    }
    void display(){
        System.out.print(name+"   "+bSalary );
    }
    double getSalary() {
        return bSalary;
    }
}
 class Worker extends Person{
    public double hrs;
    final double rate = 5.5;
    public Worker(){
    }
    public Worker(String name,double hrs) {
            super(name);
            this.hrs = hrs;
        }
        void display(){
            System.out.println(name+"   "+ (hrs*rate));
    }
    double getSalary(){
        return hrs * rate;
    }
 }
    class Staff{
     public static void main(String args[]){
           Person [] e = new Person[10];
        int n = 0, c = 0;
        do{
            System.out.println("Worker (1); Officer(2): ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            if(c == 1){
                //accept information of worker
                System.out.print("Enter worker name: ");
                String name = in.next();
                System.out.print("Enter worker working hours: ");
                int hrs = in.nextInt();
                e[n] = new Worker(name, hrs);
                n++;
            }else if(c == 2){
                //accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        }while(c != 0);
        //print all objects of e
        for(int i = 0; i < n; i++){
//print the instance of Worker only
            if(e[i] instanceof Worker)
                e[i].display();
        }
       }
}
