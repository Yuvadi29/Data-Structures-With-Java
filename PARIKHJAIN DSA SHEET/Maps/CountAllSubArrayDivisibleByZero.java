/*We are given an array and intger k. We have to find all the count of sub arrays whose sum is divisble by k
 * For eg: I/P: {5,0,2,3,1} ad K = 5
 * Sub arrays = (5),(0),(2),(3),(1)
 *              (5,0),(0,2),(2,3),(3,1)
 *              (5,0,2),(0,2,3),(2,3,1)
 *              (5,0,2,3),(0,2,3,1)
 *              (5,0,2,3,1)
 * 
 * Out of these = (5),(0),(5,0),(2,3),(0,2,3),(5,0,2,3) are divisble by 5
 * Approach:
 * Take a variable to count sub array
 * Calculate the sum of the map here
 * if sum is divisible by the k value increment count value else return 0 
 * 
 */

import java.util.*;

public class CountAllSubArrayDivisibleByZero {

    public static int subArrayCount(ArrayList<Integer> arr, int k) {

        Map<Integer, Integer> subMap = new HashMap<>();

        int countofSubarray = 0;
        int sum = 0;

        // Initialise the map with initial sum 0
        subMap.put(0, 1);

        for (int i = 0; i < arr.size(); i++) {
            // Taking the sum of elements
            sum = sum + arr.get(i);

            // Calculating Modulus to handle negative numbers correctly
            int mod = ((sum % k) + k) % k;

            // Get count of subarrays with same module
            int subcount = subMap.getOrDefault(mod, 0);

            // Increment count and update map
            countofSubarray += subcount;
            subMap.put(mod, subcount + 1);

        }

        return countofSubarray;
    }
}