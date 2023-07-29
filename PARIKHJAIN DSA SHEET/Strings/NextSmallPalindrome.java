/*We are given a number in the form of String. We have to find the smallest number strictly greater than the given number which is a palindrome 
 * Approach:
 * Every single digit number is a palindrome.
 * 
*/

import java.util.*;

public class NextSmallPalindrome {

    public static String nextLargestPalindrome(String number, int length) {
        int n = Integer.parseInt(number);

        if (isPalindrome(n)) {
            n++;
        }

        while (!isPalindrome(n)) {
            n++;
        }

        return String.valueOf(n);
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        String number = "5";
        int length = number.length();

        String nextPalindrome = nextLargestPalindrome(number, length);
        System.out.println("Next palindrome: " + nextPalindrome);
    }
}
