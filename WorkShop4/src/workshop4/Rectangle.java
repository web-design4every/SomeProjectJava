package workshop4;
import java.util.*;
public class Rectangle {
    double height, width;
    Rectangle(){
    }
    Rectangle(double height, double width)
    {
        this.height = height;
        this.width  = width;
    }
    
    double getArea()
    {
        return (height * width);
    }
   
    double getPerimeter()
    {
        return (2 * (height + width));
    }
    void input()
    {
        Scanner t = new Scanner(System.in);
        System.out.print("Input width of Rectangle: ");
        width=Double.parseDouble(t.nextLine());
        System.out.print("Input height of Rectangle: ");
        height=Double.parseDouble(t.nextLine());
    }
    void display()
    {
        System.out.print("\nArea of rectangle: "+this.getArea()+"\nPerimeter of rectangle: "+this.getPerimeter()+"\n");
    }
     public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();
        rect.display();
   }
    
}
