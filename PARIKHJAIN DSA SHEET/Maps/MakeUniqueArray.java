/*WE are given an array of size N and we have to tell minimum number of elements that need to be removed such that the array contains all distinct elements. 
 * There should not be any i and j such that i!=j and arr[i] = arr[j]
 * For eg: N = 4 and arr = {1,2,1,2}
 * O/p: 2 as 1 and 2 are repeated so we will need to remove 2 elements
 * 
 * Approach:
 * initialise the removed variable to keep a count of variables to remove
 * Iterate through the array
 * i as initial element and j is the next one
 * i will have all the even indexes and j will have all the odd indexes
 * check if the index and elements are equal or not
 * if equal increment removed else continue
 */

import java.util.*;

public class MakeUniqueArray {
    public static int minElementssToRemove(ArrayList<Integer> arr) {

        Map<Integer, Integer> frquentMap = new HashMap<>();
        // To keep a count of the variables to remove
        int remove = 0;

        // Calculate the frequency of each element
        for (Integer num : arr) {
            frquentMap.put(num, frquentMap.getOrDefault(num, 0) + 1);
        }

        // Check the condition
        for (Integer count : frquentMap.values()) {
            remove = remove + count - 1;
        }
        return remove;
    }
}
