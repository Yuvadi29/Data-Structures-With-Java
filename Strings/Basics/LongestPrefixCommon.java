/*We are given an array of strings. We have to find the longest common prefix in them
 * Approach:
 * Start by initialising empty string which stores repeated substring
 * check if strs is empty or not
 * Initialise minLength to Intger.maxvalue which will keep track of minimum length among all strings in array
 * loop through strings 
 * Inside the loop, we extract the character at index i from the firstString and store it in the currentChar variable. This will be the character we compare with the corresponding index in all other strings.
We initialize a boolean variable isRepeated to true, assuming that the character at index i is repeated among all strings.
We have an inner loop that iterates from 1 to strs.length - 1 (1 to 2 in this case). This loop checks if the character at index i in each string (flow, flight) is equal to the currentChar. If any character differs, we set isRepeated to false and break out of the inner loop.
After the inner loop finishes, we check if isRepeated is true. If it is, it means the character at index i is repeated among all strings, so we concatenate it to the repeat string using the += operator.
 * 
 */

import java.util.*;

public class LongestPrefixCommon {

    public static String longestCommonPrefix(String[] strs) {

        String repeat = "";

        if (strs.length == 0) {
            return "";
        }

        String firstString = strs[0];
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        for (int i = 0; i < minLength; i++) {
            char currentChar = firstString.charAt(i);
            boolean isRepeated = true;

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    isRepeated = false;
                    break;
                }
            }

            if (isRepeated) {
                repeat += currentChar;
            } else {
                break;
            }
        }

        return repeat;

    }

    public static void main(String[] args) {
        String[] strs = { "fly", "flower", "flow" };

        System.out.println(longestCommonPrefix(strs));
    }
}
