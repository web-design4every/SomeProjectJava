package pe_trial;
import java.util.*;
public class Fan {
    public String code;
    public double price;
    public Fan(){      
    }
    public Fan(String code, double price){
        this.code=code;
        this.price=price;
        
    }
    public String getCode(){
        return code;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static void main(String[] args) {
     
    }
    
}
