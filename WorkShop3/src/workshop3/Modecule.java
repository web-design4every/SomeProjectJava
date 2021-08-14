package workshop3;
import java.util.*;
class Modecule{
    public String structure;
    String name;
    Double weight;
    public Modecule(){
}
    public Modecule(String xstructure, String xname, Double xweight)
    {
        structure = xstructure;
        name = xname;
        weight = xweight;
    }
    void setdata(String xStruc, String xNam, Double xWei)
        {
            structure = xStruc;
            name = xNam;
            weight = xWei;
        }
    public String getdata()
    {
        return structure;
    }
    void display()
        {
           System.out.println(structure+"  "+name +"  "+weight+"  ");
        }
    void inputstructure()
         {   
        Scanner t = new Scanner(System.in);
             System.out.print("\nEnter structure : ");
             structure = t.nextLine();
         }
    void inputname()
    {
             Scanner t = new Scanner(System.in);
             System.out.print("Enter fullname : ");
             name = t.nextLine(); 
    }
    void inputweight()
    {       Scanner t = new Scanner(System.in);
             System.out.print("Enter weight : ");
             weight=Double.parseDouble(t.nextLine());
        
    }
    public static void main(String args[]){
             int a,count=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Modecule> ModeculeList = new ArrayList <>();
             System.out.println("Modecule Information.");
             System.out.println("==================");
             System.out.print("Input number of Modecule: ");
             a=sc.nextInt();
             do{
                Modecule Mo= new Modecule();
                Mo.inputstructure();
                    if(Mo.getdata().equalsIgnoreCase("0"))
                    {
                      break;
                    }else
                    {
                      Mo.inputname();
                      Mo.inputweight();
                      ModeculeList.add(Mo);
                      count++;
                    }
             }while(count<a);
             System.out.println("\nDisplay:\n");
             for(int i=0; i < ModeculeList.size(); i++){
                    ModeculeList.get(i).display();
                }
    }
        
}
