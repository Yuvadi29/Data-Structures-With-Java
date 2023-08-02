/*We are given an unsorted array of N intgers. We have to return the length of the longest consecutive sequence */

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Using Hashmap
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int maxLength = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                maxLength = Math.max(maxLength, currLen);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 9, 10, 10, 6 };
        int N = 7;

        System.out.print(lengthOfLongestConsecutiveSequence(arr, N));
    }
}
