/*We are given a text messsage. We have to Apply Run Length Encoding. Here we represent repeated successive characters as character and the count of repitition.
 * For eg: I/P: aabbbb
 * O/P: a2b4
 * 
 * Approach:
 * Iterate through the string
 * Initialise a count variable to count the repetitions
 * If charAt(i) == charAt(i+1): count++;
 * else continue
 */

import java.util.*;

public class RunLengthEncoding {
    public static String encode(String message) {
        StringBuilder encodedMessage = new StringBuilder();
        int n = message.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && message.charAt(i) == message.charAt(i + 1)) {
                count++;
                i++;
            }
            encodedMessage.append(message.charAt(i)).append(count);
        }
        return encodedMessage.toString();
    }

    public static void main(String[] args) {
        String message = "AAAABBBCCDAA";
        String encodedMessage = encode(message);
        System.out.println(encodedMessage);
    }
}
