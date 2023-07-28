/*We are given an array of intergers. We are supposed to find all the elements that occur strictly more than floor(N/3) times in the array.
 * 
 * For eg: I/P: 3 2 2 1 5 2 3
 * O/P: 2
 * floor(N/3) = floor(7/3) is equal to 2, and 2 occurs 3 times which is strictly more than N/3. No other element occurs more than 2 times.
 * 
 * Basic Approach:
 * Take the initial value as the current elem
 * Iterate it till the length of the array
 * if you get the same element, increment the count till you get the element. After that find out thee floor(N/3) value.

 Better Approach:
 Take an empty Hashmap with Number and Count as key value pair
 Iterate over the array 
 Check the condition and likewise increase the Key value pairs. 
 From it select the ones whose count is greater than floor(N/3)

 */

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElem2 {

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();

        if (arr == null || arr.size() == 0) {
            return result;
        }

        int n = arr.size();
        int count1 = 0;
        int count2 = 0;
        Integer elem1 = null;
        Integer elem2 = null;

        for (int i = 0; i < arr.size(); i++) {
            if (elem1 != null && arr.get(i).equals(elem1)) {
                count1++;
            } else if (elem2 != null && arr.get(i).equals(elem2)) {
                count2++;
            } else if (count1 == 0) {
                count1 = 1;
                elem1 = arr.get(i);
            } else if (count2 == 0) {
                count2 = 1;
                elem2 = arr.get(i);
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (elem1 != null && arr.get(i).equals(elem1)) {
                count1++;
            }
            if (elem2 != null && arr.get(i).equals(elem2)) {
                count2++;
            }
        }

        int minOccurrence = n / 3;
        if (count1 > minOccurrence) {
            result.add(elem1);
        }
        if (count2 > minOccurrence) {
            result.add(elem2);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(3);

        ArrayList<Integer> result = majorityElementII(arr);
        System.out.println(result); // Output: [2]
    }
}
