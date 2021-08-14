package workshop5_1;
import java.util.*;
public class PhoneNumber {
    public int area;
    public String number;
    public PhoneNumber(){
    }
    public PhoneNumber(int a, String n){
        a=area;
        n=number;
    }
    void input(){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter area code: ");
        area=Integer.parseInt(t.nextLine());
        System.out.print("Enter number: ");
        number=t.nextLine();
    }
    void display(){
       System.out.println(area+"  -  "+ number);
    }
}

