/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Approach:
Iterate through the array
Store the array elements in a variable
Increment the variable
Print the variable in the form of an Array
*/

import java.util.*;

public class PlusOne {

    // Iterate through the array
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        List<Integer> result = new ArrayList<Integer>();

        int carry = 1;
        // iterating over an array
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result.add(sum % 10);
            carry  = sum / 10;
        }

        if(carry > 0){
            result.add(carry);
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(result.size() - 1 -i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        System.out.println(plusOne(digits));
    }
}
