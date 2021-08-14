/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

/**
 *
 * @author Admin
 */
public class Employee {
    int EmployeeID;
    String EmployeeName;
    String Phone;
    String Email;
    String Address;

    public Employee() {
    }

    public Employee(int EmployeeID, String EmployeeName, String Phone, String Email, String Address) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}
