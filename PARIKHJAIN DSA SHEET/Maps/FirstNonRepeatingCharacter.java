/* We are provided with a string. we are to return the first unique character in the string. If there is no non-repeating character print the first character of the string. If no repeating character return the first character
 * For eg. i/p: aDcadhc
 * o/p: D
 * This is because a is repeated here and D is the first unique character
 * Take the Capital and Small characters as different characters 
 * Approach:
 * Hash Map where Integer will be the index and String will be the value
 * Compare if the current and next is equal or not, if not equal update the String value to be returned
*/

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String str) {
        // Initialise the Map
        Map<Character, Integer> repeatMap = new HashMap<>();

        // Iterate through the String and converting it to charArray initially and add it in the Map
        for (Character ch : str.toCharArray()) {
            repeatMap.put(ch, repeatMap.getOrDefault(ch, 0) + 1);
        }

        // Check the condition
        for (Character ch : str.toCharArray()) {
            if(repeatMap.get(ch) == 1){
                return ch;
            }
        }
        return str.charAt(0);
    }

    public static void main(String[] args) {

    }
}
