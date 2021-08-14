package Workshop_1;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner t= new Scanner(System.in);
        int c=0, d=0, e=0;
        System.out.println("Ending time calculator");
        System.out.println("Input starting time in hours:");
        c=t.nextInt();
        System.out.println("Input starting time in minutes:");
        d=t.nextInt();
        System.out.println("Event start at:  "+c+":"+d);
        System.out.println("Input a duration in total minutes:");
        e=t.nextInt();
        System.out.println("Ending time:  "+((c*60+d+e)/60)+":"+((c*60+d+e)%60));
    }
}
