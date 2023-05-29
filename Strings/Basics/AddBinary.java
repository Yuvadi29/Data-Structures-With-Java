/*We are given 2 strings a and b . We have to return their sum as a binary string
 * Approach:
 * We will start from adding the right side as addition in Binary takes place from right to left. 
 * When sum is more than one, store the carry for next digits
 * 
 * 
 */

import java.util.*;

public class AddBinary {

    public static String addBinary(String a, String b) {

        // Traversing both the string characters from last ones
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Initialising result
        int carry = 0;
        int sum = 0;

        // Since we have to mutate the String value, we create an object result from the StringBuilder class. It represents mutable sequence of characters.
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            // Calculate sum of last digits and carry
            sum = carry;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
            }
            result.append((char)(sum%2+'0'));
            carry = sum / 2;
            i--;
            j--;
            // If current sum is 1 or 3, add 1 to result
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        System.out.println(addBinary(a, b));
    }
}
