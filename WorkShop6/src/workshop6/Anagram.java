package workshop6;
import java.util.*;
public class Anagram{

    public static boolean CheckAnagrams(String string1, String string2) {
        String str1 = character(string1);
        String str2 = character(string2);

	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    str1 = sort(str1);
	    str2 = sort(str2);

        return str1.equals(str2);
    }
    
//Xoa bo so va cac ki tu dac biet
    protected static String character(String string) {
        int i, len = string.length();
        StringBuilder remove = new StringBuilder(len);
  	char c;
        for (i = (len - 1); i >= 0; i--) {
	        c = string.charAt(i);
	        if (Character.isLetter(c)) {
		        remove.append(c);
	        }
	    }
         return remove.toString();
    }

//Sap xep cac ki tu vao mang
    protected static String sort(String string) {
                char[] charArray = string.toCharArray();

	    Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        String string1 = "Goodbye! True lady.asd";
        String string2 = "Obey, Adultery God?";
        System.out.println("Check out whether the 2 strings below are anagrams:");
        System.out.println("    String 1: " + string1);
        System.out.println("    String 2: " + string2);
        System.out.println();

        if (CheckAnagrams(string1, string2)) {
            System.out.println("They ARE anagrams!");
        } else {
            System.out.println("They are NOT anagrams!");
        }
        System.out.println();
    }
}