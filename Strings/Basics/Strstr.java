/*We are given needle and haystack. We have to return index of first occurance of needle in haystack. If needle is not a part of it, return -1; 
 * Approach:
 * Iterate through the haystack
 * if(haystack[i] == needle[i])
 * Add the element in another array temp. So that all the elements which are same in both the strings will be added. 
 * Then return the 
*/

import java.util.*;

public class Strstr {

    public static int strStr(String haystack, String needle) {

        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        // If needle string is empty return 0
        if (needle.equals("")) {
            return 0;
        }

         /*
        * Traverse through the haystack string */
        for(int currentIndex = 0; currentIndex < haystack.length() - needle.length() + 1; currentIndex++){
            // If the character at the current index equals the character at the first needle index
            if(haystack.charAt(currentIndex) == needle.charAt(0))
                /*
                * check to see if the substring at the current index in the haystack */
                if(haystack.substring(currentIndex, needle.length() + currentIndex).equals(needle))
                    // return the current index
                    return currentIndex;
        }

        // Otherwise return -1
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}
