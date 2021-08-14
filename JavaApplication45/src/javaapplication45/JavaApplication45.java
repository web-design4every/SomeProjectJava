/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication45 ja = new JavaApplication45();
        System.out.println(ja.lengthOfLongestSubstring("pwwkew"));
    }
    
    public int lengthOfLongestSubstring(String s) {
        ArrayList arr = new ArrayList();
        int max = 0;
        boolean existed = false;
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                for (int k = 0; k < arr.size(); k++) {
                    if (arr.get(k).equals(s.charAt(j))) {
                        existed = true;
                    }
                }
                if (existed==true) {
                    max = max > arr.size() ? max : arr.size();
                    arr.clear();
                    existed = false;
                    break;
                }else{
                    arr.add(s.charAt(j));
                    max = max > arr.size() ? max : arr.size();
                }
            }
        }
        return max;
    }
}
