/*We are given a string pattern which only contains parenthesis. We have to dins the minimum number of parenthesis we must add to make the string pattern valid. 
 * 
Approach:
Convert Strings into Character Array
Iterate through the array
n1 = '(' n2=')'
count the number of ( and )
if (n(n1) > n(n2) { n(n1) - n(n2)} and return the n(n1) else
n(n2) - n(n1) and return n(n2) 

A pattern will be valid if balance is 0. If it is negative we add '(' at beginning else we add ')' at the end
*/

import java.util.*;

public class MinimumParenthesis {

    public static int minimumParentheses(String pattern) {

        int balance = 0;
        int minParen = 0;

        for (int i = 0; i < pattern.length(); ++i) {
            balance += pattern.charAt(i) == '(' ? 1 : -1;

            if (balance == -1) {
                minParen = minParen + 1;
                balance = balance + 1;
            }
        }
        return balance + minParen;

    }

    public static void main(String[] args) {
        String val = "())";
        System.out.println(minimumParentheses(val));
    }

}
