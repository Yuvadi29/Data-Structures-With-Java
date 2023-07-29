/*This is the starting for the problems based on Strings. This file is just to revise the concepts of Strings in Java. Remember In Java STRINGS ARE IMMUTABLE MEANING THEIR VALUE WILL NOT CHANGE ONCE INITIALISED.*/

import java.util.*;

public class Introduction {
    
    public static void main(String[] args) {
        // Initialising a string
        String s = "Coding Adda";

        // If we want to mutate the string in Java, we convert into a CharArray and then add the mutation.
        char[] str = s.toCharArray(); //This will convert the string s into a character Array
        str[6] = ',';
        System.out.println(str);
    }
    
}
