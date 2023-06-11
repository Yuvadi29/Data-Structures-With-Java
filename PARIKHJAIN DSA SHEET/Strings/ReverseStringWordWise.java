/*We are given a string. We have to return the String word wise
 * for eg: Coding Adda
 * op: Adda Coding 
 * Approach 1;
Iterate through the string and convert into array 
Agar element at index 0 hai toh usko arr[length - 1] pe dalo
Saare elements to left shift karo 

Approach 2;
Iterate through the array
Store elements in an array
Iterate from the last element
 */

import java.util.*;

public class ReverseStringWordWise {

    static String reverseStringWordWise(String input) {

        // We can convert the input into a String Array by splitting them.
        // Do not consider the blank spaces

        String[] strArray = null;
        String output = "";

        strArray = input.split(" ");

        for (int i = strArray.length - 1; i >= 0; i--) {
            output += strArray[i] + " ";
        }
        return output.trim();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
