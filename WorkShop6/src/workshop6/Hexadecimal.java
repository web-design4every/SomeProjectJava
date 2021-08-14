package workshop6;
import java.util.*;
public class Hexadecimal {
 
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
       String str; 
       long value;
       int i; 
       System.out.print("Enter a hexadecimal number: ");
       str = t.nextLine();
       value = 0;
       for ( i = 0; i < str.length(); i++ ) {
          int digit = hexValue( str.charAt(i) );// chuyen doi 1-1 giua 2 he co so
          if (digit == -1) {
              System.out.print("Error:  Input is not a hexadecimal number.");
              return;//if contains any characters that are not hexadecimal digits.
          }
          value = value*16 + digit;
       }
       System.out.println("Base-10 value:  " + value);
    }
    //find the hexadecimal value of a given character
    static int hexValue(char ch) {
       switch (ch) {
          case '0':
             return 0;
          case '1':
             return 1;
          case '2':
             return 2;
          case '3':
             return 3;
          case '4':
             return 4;
          case '5':
             return 5;
          case '6':
             return 6;
          case '7':
             return 7;
          case '8':
             return 8;
          case '9':
             return 9;
          case 'a':  
          case 'A':
             return 10;
          case 'b':
          case 'B':
             return 11;
          case 'c':
          case 'C':
             return 12;
          case 'd':
          case 'D':
             return 13;
          case 'e':
          case 'E':
             return 14;
          case 'f':
          case 'F':
             return 15;
          default:
             return -1;
       }
    } 

}
