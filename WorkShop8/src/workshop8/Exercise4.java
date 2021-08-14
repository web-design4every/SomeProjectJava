/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop8;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
 
/**
 *
 * @author Admin
 */
public class Exercise4 {
 
    public static void copyFile(String source, String folder) {
        Path sourceFile = Paths.get(source);
        Path targetDir = Paths.get(folder);
        Path targetFile = targetDir.resolve(sourceFile.getFileName());
 
        try {
 
            Files.copy(sourceFile, targetFile);
 
        } catch (FileAlreadyExistsException ex) {
            System.err.format("File %s already exists.", targetFile);
        } catch (IOException ex) {
            System.err.format("I/O Error when copying file because src or dest do not exists");
        }
    }
 
    public static void main(String[] args) {
        String src ;
        String dest ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name to Open (with extension like file.txt) : ");
         src = sc.nextLine();
         //ten cua file src la src.txt
         
         System.out.println("Enter Folder Name to Open: ");
         dest = sc.nextLine();
         //ten cua file dest la dest
         
        copyFile(src, dest);
    }
}
