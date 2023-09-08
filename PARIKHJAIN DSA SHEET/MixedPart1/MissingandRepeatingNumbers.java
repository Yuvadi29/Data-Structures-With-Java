/*We are given an array of size N and elements range from 1 to N
There is a number R in the range which appears twice in array and a number M which is missing from the array
We have to R and M
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

public class MissingandRepeatingNumbers {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Create a HashMap to store the count of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Create an integer array to store the result, with two slots for missing and
        // repeating numbers
        int[] res = new int[2];

        // Count the occurrences of each element in the input array
        for (int c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Iterate from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // If the element 'i' is not in the map, it's the missing number
            if (!map.containsKey(i)) {
                res[0] = i;
            }
            // If the element 'i' is in the map and its count is greater than 1, it's the
            // repeating number
            if (map.containsKey(i) && map.get(i) > 1) {
                res[1] = i;
            }
        }

        // Return the array containing the missing and repeating numbers
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        int n = 6;

        int[] result = missingAndRepeating(arr, n);
        System.out.println("Missing Number is: " + result[0]);
        System.out.println("Repeating Number is: " + result[1]);
    }
}
