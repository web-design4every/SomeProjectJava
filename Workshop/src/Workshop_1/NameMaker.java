package Workshop_1;
import java.util.Scanner;
public class NameMaker {
    public static void main(String[] args){
        Scanner t= new Scanner(System.in);
        String firstName, middleName, lastName, fullName;
        System.out.print("Enter your first name: ");
        firstName = t.next();
        System.out.print("Enter your middle name: ");
        middleName = t.next();
        System.out.print("Enter your last name: ");
        lastName = t.next();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("\r\nHello "+fullName);
    }
}
