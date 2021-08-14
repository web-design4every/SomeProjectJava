package Workshop_2;
public class Exercise1_2 {
    public static void main(String[] args){
        boolean flag=true;
        int i=2;
        while(flag==true){
            if(i<=10){
                if(i%2==0){
                    System.out.print(i+" ");
                }
                i++;
            }else{
                flag=false;
            }
        }
        System.out.print("\r\n ");
        }
        
}