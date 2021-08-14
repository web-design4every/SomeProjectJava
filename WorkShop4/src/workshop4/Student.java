package workshop4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
public String name;
public String studentId;
public Date birthDate;
public String address;
public String major;
public double mark;

public Student(){
    
}
void setData( String name,String studentId,Date birthDate,String address,String major,double mark){ 
    this.name = name;
    this.studentId = studentId;
    this.birthDate = birthDate;
    this.address = address;
    this.major = major;
    this.mark = mark;
}

public void printAllAttributes( ){ 
    System.out.println("Name:"+name);
    System.out.println("Student ID:"+studentId);
    System.out.println("Date of Birth:"+ birthDate);
    System.out.println("Address:"+address);
    System.out.println("Major:"+major);
    System.out.println("Mark:"+mark);
}

public static void main(String[] args) throws ParseException {
    Student st = new Student();
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date d =new Date();
    d = simpleDateFormat.parse("7-13-2000");
//    Date d =new Date();
    
//    System.out.println(d);
    st.setData("Hoang Tung Lam", "HE141405",d, "Ha Noi","Software engineering", 10);
//    Date d =new Date();
//    System.out.println(d);
    st.printAllAttributes();
}
}

