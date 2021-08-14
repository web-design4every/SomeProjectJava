/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class DictionaryWord implements Comparable<DictionaryWord>{
        String word;
        String meanings;

    public DictionaryWord() {
    }

    public DictionaryWord(String word, String meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }

    @Override
    public int compareTo(DictionaryWord o) {
        return word.compareTo(o.word);
    }

    @Override
    public String toString() {
        return word + "\n" + meanings;
    }
    
    
}
class Workshop9 {
    public static void main(String[] args) {
        ArrayList<DictionaryWord> list = new ArrayList<>();   
        ////Creating DictionaryWord
        DictionaryWord d1= new DictionaryWord("bank robber", "Steals money from a bank");
        DictionaryWord d2= new DictionaryWord("burglar", "Breaks into a home to steal things");
        DictionaryWord d3= new DictionaryWord("forger", "Makes an illegal copy of something");
        DictionaryWord d4= new DictionaryWord("hacker", "Breaks into a computer system");
        DictionaryWord d5= new DictionaryWord("hijacker", "Takes control of an airplane");
        DictionaryWord d6= new DictionaryWord("kidnapper", "Holds someone for ransom money");
        DictionaryWord d7= new DictionaryWord("mugger", "Attacks and steals money from someone");
        DictionaryWord d8= new DictionaryWord("murderer", "Kills another person");
       
        //Adding word to list
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        list.add(d7);
        list.add(d8);
        
        Collections.sort(list);
        Set<DictionaryWord> set=new TreeSet<DictionaryWord>(list);
        //use Set to ensure no duplicate
        int n=1;
        for (DictionaryWord d : set) {
            System.out.println(n+"."+d.toString());
            n++;
        }
        
}
}

