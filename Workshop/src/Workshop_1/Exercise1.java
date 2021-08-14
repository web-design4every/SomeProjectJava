package Workshop_1;
import java.util.Scanner;
public class Exercise1 {
      public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        int a = 0,b = 0;
        System.out.print("Input hours:");
        a=t.nextInt();
        System.out.println("Input minutes:");
        b=t.nextInt();
        System.out.println("Output total minutes:"+(a*60+b));
        
    }
    
}
