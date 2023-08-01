import java.util.*;

public class Triplets {

    // Utility function for finding triplet in array
    public static ArrayList<Integer> findTriplets(int[] arr, int n) {
        // Write your code here.
        ArrayList<Integer> tripletsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] == arr[k]) || (arr[i] + arr[k] == arr[j]) || (arr[j] + arr[k] == arr[i])) {
                        // Found a triplet, add it to the result ArrayList
                        tripletsList.add(arr[i]);
                        tripletsList.add(arr[j]);
                        tripletsList.add(arr[k]);
                    }
                }
            }
        }

        return tripletsList;
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr = { 5, 32, 1, 7, 10, 50, 19, 21, 2 };
        int n = arr.length;

        findTriplets(arr, n);
    }
}
