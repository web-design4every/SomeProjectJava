package Workshop_2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner t= new Scanner(System.in);
        int n,i;
        int array[] = new int[100];
        System.out.print("Input numbers of element: ");
        n=t.nextInt();
        System.out.println("Input elements of the arrays: ");
        for(i=0;i<n;i++){
            System.out.print("array"+"["+i+"]"+"=");
            array[i]=t.nextInt();
        }
        System.out.print("Display all elements: ");
        for(i=0;i<n;i++){
        System.out.print(array[i]+" ");
        }
        System.out.print("\r\n");
        int  temp =  0 ;  
        for  (i =  0 ; i <(n- 1) ; i ++) {  
        for  ( int  j =  i+1 ; j <=n-1; j ++) {  
            if  (array [i]> array [j ]) {  
                temp = array [i];  
                array [i] = array [j ];  
                array [j] = temp;  
            }  
        }  
    }   System.out.print("Sort all numbers in ascending order: ");
        for(i=0;i<n;i++){
        System.out.print(array[i]+" ");
        }
        int max=array[0];
        for(i=0;i<n;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
         System.out.println("\r\nMax value of the arrays: "+max);
        }
    
}
