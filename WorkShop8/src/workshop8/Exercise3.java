/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop8;

/**
 *
 * @author Admin
 */		
import java.util.Scanner;
import java.io.*;

public class Exercise3
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        /* nhập tên tệp với phần mở rộng để mở và đọc nội dung của nó */
        
        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();
        
        
        String line = null;
        try
        {
            /* FileReader đọc các tệp văn bản */
            FileReader fileReader = new FileReader(fname);
            
            /* sử dụng BufferedReader cho FileReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            /* đóng file sau khi dùng xong */
            bufferedReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error reading file named '" + fname + "'");
        }
        catch(IOException e)
        {
            e.printStackTrace ( );
        }
    }
}