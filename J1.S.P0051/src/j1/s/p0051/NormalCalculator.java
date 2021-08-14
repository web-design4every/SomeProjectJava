/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

/**
 *
 * @author Admin
 */
public class NormalCalculator {
    public static double input(double number){
        System.out.println("Enter number: ");
        number = Validate.checkDouble();
        return number;
    }
    public static void normalCalculator(){
            double number;
            System.out.println("----- Normal Calculator -----");
            System.out.println("Enter number: ");
            number = Validate.checkDouble();
            while (true) { 
            System.out.println("Enter Operator:");
            String operator = Validate.checkInputOperator();
            if(operator.equalsIgnoreCase("+")){
                number+=input(number);
            }
            if(operator.equalsIgnoreCase("-")){
                number-=input(number);
            }
            if(operator.equalsIgnoreCase("*")){
                number*=input(number);
            }
            if(operator.equalsIgnoreCase("/")){
                number/=input(number);
            }
            if (operator.equalsIgnoreCase("^")) {
                number = Math.pow(number, input(number));
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + number);
                return;
            }
            System.out.println("Memory: " + number);
            
}
}
}
