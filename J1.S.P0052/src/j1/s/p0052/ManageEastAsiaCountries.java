/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ManageEastAsiaCountries {
    private  Scanner in = new Scanner(System.in);
    Validation v = new Validation();
    ArrayList<Country> lc = new ArrayList<>();
    //display menu
    public int menu(){
        System.out.println("\n1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 5);
        return choice;
    }

    //allow user input infomation of contries
    public void inputCountry() {
        System.out.print("Enter code of country: ");
        String countryCode = v.checkInputString();
        //check code contry exist or not
        if (!checkCountryExist(countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of country: ");
        String countryName = v.checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = v.checkInputDouble();
        System.out.print("Enter terrain of country: ");
        String countryTerrain = v.checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    //display infomation of country
    public void printCountry() {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //display infomation sort name in ascending
    public void printCountrySorted() {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //allow user search infomation contry by name
    public void searchByName() {
        System.out.print("Enter the name you want to search for: ");
        String countryName = v.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }

    //check country exist by code
    public boolean checkCountryExist(String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
}
