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
public class BMI {
    public static void Status(double bmi){
        if (bmi < 19) {
            System.out.println("Under-standard.");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight.");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("Fat-should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediately");
        }
    }
    public static void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
        System.out.print("Enter Weight(kg): ");
        double weight = Validate.checkDouble();
        System.out.print("Enter Height(cm): ");
        double height = Validate.checkDouble();
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.print("BMI Status: " );
        Status(bmi);
    }
}
