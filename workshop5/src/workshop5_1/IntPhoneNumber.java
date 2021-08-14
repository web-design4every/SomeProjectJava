package workshop5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class IntPhoneNumber extends PhoneNumber{
    String countrycode;
    public IntPhoneNumber(){
    }
    public IntPhoneNumber (String cc, int a, String n){
        cc=countrycode;
        a=super.area;
        n=super.number;
    } 
    void input(){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter country code: ");
        countrycode=t.nextLine();
        super.input();
    }
    void display(){
        System.out.println(countrycode +"  -  "+super.area+"  -  "+super. number);
    }
public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<PhoneNumber> phonelist = new ArrayList <>();
        System.out.print("Enter list of phone numbers");
        System.out.print("\n-----------------------------------------\n");
        while(true){
        System.out.print("\nType of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit): ");
         char n;
            while( true){
                n = t.next().charAt(0);
                if(n >= 48 && n <= 50) break;
                else System.out.println("Please! Re-enter");
            }
            if(n==49){
                PhoneNumber pn=new PhoneNumber();
                pn.input();
                phonelist.add(pn);
            }
            if(n==50){
                IntPhoneNumber ipn=new IntPhoneNumber();
                ipn.input();
                phonelist.add(ipn);
            }
            if(n==48){
                break;
            }
    }
        System.out.print("\nList of phone number: ");
        System.out.print("\n----------------------------------------\n");
        for(int i=0; i < phonelist.size(); i++){
                    phonelist.get(i).display();
                }
} 
}