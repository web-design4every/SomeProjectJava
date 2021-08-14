package workshop4;
import java.util.*;
public class Fraction {
    private int tu, mau;
    public Fraction(){
        
    }
    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void symplify() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void Addition(Fraction ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction PSaddition = new Fraction(ts, ms);
        PSaddition.symplify();
        System.out.println("Addition of fractions = " + PSaddition.tu + "/" + PSaddition.mau);
    }
      
    public void Subtraction(Fraction ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction PSsubtraction = new Fraction(ts, ms);
        PSsubtraction.symplify();
        System.out.println("Subtraction of fractions = " + PSsubtraction.tu + "/" + PSsubtraction.mau);
    }
     
    public void Multiplication(Fraction ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Fraction PSmultiplication = new Fraction(ts, ms);
        PSmultiplication.symplify();
        System.out.println("Multiplication of fractions = " + PSmultiplication.tu + "/" + PSmultiplication.mau);
    }
     
    public void Division(Fraction ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Fraction PSdivision = new Fraction(ts, ms);
        PSdivision.symplify();
        System.out.println("Division of fractions = " + PSdivision.tu + "/" + PSdivision.mau);
    }
    
     public static void main(String args[]){
         int ts1,ms1,ts2,ms2;
         Scanner t = new Scanner(System.in);
         System.out.print("Program manage fractions\n");
         System.out.print("--------------------------------\n");
         System.out.print("Input numerator of first fraction: ");
         ts1=t.nextInt();
         System.out.print("Input numerator of first denominator: ");
         ms1=t.nextInt();
         System.out.print("Input numerator of second fraction: ");
         ts2=t.nextInt();
         System.out.print("Input numerator of second denominator: ");
         ms2=t.nextInt();
         Fraction fraction1=new Fraction(ts1,ms1);
         Fraction fraction2=new Fraction(ts2,ms2);
         while(true){
         System.out.print("1) Addition\n");
         System.out.print("2) Subtraction\n");
         System.out.print("3) Multiplication\n");
         System.out.print("4) Division\n");
         System.out.print("5) Exit\n");
         System.out.print("Enter your choice: ");
         char n;
            while( true){
                n = t.next().charAt(0);
                if(n >= 49 && n <= 53) break;
                else System.out.println("Please! Re-enter");
            }
            if(n==49){
                fraction1.Addition(fraction2);
            }           
            if(n==50){
                fraction1.Subtraction(fraction2);
            }
            if(n==51){
                fraction1.Multiplication(fraction2);
            }
            if(n==52){
                fraction1.Division(fraction2);
            }
            if(n==53) break;
         }
    }
}
