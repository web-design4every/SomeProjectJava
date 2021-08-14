/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;

/**
 *
 * @author Admin
 */
//public class RightTriangle{
//	int a, b, c;
//
//       public RightTriangle() {
//       }     
////Constructor
//  public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException{
//	if ((a >= b + c)||(b >= a + c)||(c >= b + a)){
//        throw new IllegalTriangleException();
//        }else  if ((a*a + b*b == c*c || a*a +c*c == b*b) || b*b + c*c == a*a){
//            this.a = a;  
//            this.b = b;
//            this.c = c;
//        }else {
//            throw new IllegalRightTriangleException();
//        }
//
//}
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//}
//
public class RightTriangle {
    int a, b, c;

//Constructor
    public RightTriangle(int a, int b, int c) throws IllegalTriangleException,IllegalRightTriangleException{
	//implement it
       if ((a >= b + c)||(b >= a + c)||(c >= b + a)){
            throw new IllegalTriangleException();
        }
        else {
            if ((a*a + b*b != c*c) && (a*a +c*c != b*b) && (b*b + c*c != a*a)){
                throw new IllegalRightTriangleException();
            }
        }  
    }

}
