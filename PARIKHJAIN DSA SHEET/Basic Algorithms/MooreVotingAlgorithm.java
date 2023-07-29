/*We are given an array consisting of N integers. 
 * We have to find the majority element in the array. If there is no majority element present, print -1.
 */

public class MooreVotingAlgorithm {

    public static int findMajority(int[] arr, int n) {
        int count = 0;
        int elem = 0;

        // Applying Algo
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                elem = arr[i];
            } else if (elem == arr[i])
                count++;
            else
                count--;
        }

        // Checking if stored element is majority one
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elem) {
                count1++;
            }
        }

        if (count1 > (n / 2))
            return elem;
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 3, 9, 2, 2 };

        System.out.println(findMajority(arr, n));

    }
}
