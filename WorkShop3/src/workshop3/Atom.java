package workshop3;
import java.util.*;
class Atom {
        Scanner t = new Scanner(System.in);
        public int number;
        public String symbol;
        public String fullname;
        public float weight;
        public Atom()
        {}
        Atom(int xNumber, String xSymbol, String xFullname, float xWeight)
        {
            number = xNumber;
            symbol = xSymbol;
            fullname = xFullname;
            weight = xWeight;
        }
        void setdata(int xNum, String xSym, String xFull, float xWei)
        {
            number = xNum;
            symbol = xSym;
            fullname = xFull;
            weight = xWei;
        }
        void display()
        {
           System.out.println(number+"    "+symbol+"     "+fullname+"    "+weight+"    ");
        }
        boolean inputnumber()
         {
             Scanner t = new Scanner(System.in);
             System.out.print("\nEnter atomic number : ");
              number = Integer.parseInt(t.nextLine());
              if(number==0){
                  return false;
              }
              return true;
         }
        void inputsymbol()
        {
            Scanner t = new Scanner(System.in);
             System.out.print("Enter symbol : ");
             symbol = t.nextLine();
        }
        void inputname()
        {
            Scanner t = new Scanner(System.in);
            System.out.print("Enter full name : ");
             fullname = t.nextLine();
        }
        void inputweight()
        {
            Scanner t = new Scanner(System.in);
            System.out.print("Enter atomic weight : ");
            weight=Float.parseFloat(t.nextLine());
        }
        

         public static void main(String args[])
         {
             Scanner sc = new Scanner(System.in);
        ArrayList<Atom> AtomList = new ArrayList <>();
             System.out.println("Atomic Information.");
             System.out.println("==================");
             int count=0;
        while(true){
            Atom at = new Atom();
                    if(at.inputnumber()==false)
                    {
                      break;
                    }else
                    {
                      at.inputsymbol();
                      at.inputname();
                      at.inputweight();
                      AtomList.add(at);
                      count++;
                    }
            if(count==10) break;
       }
        System.out.println("\nDisplay:\n");
             for(int i=0; i < AtomList.size(); i++){
                    AtomList.get(i).display();
                }
    }
         }
                
    
    

