/*We are given an array of N integers and integer value TARGET. We have to check whther there are 4 numbers such that 0<=i<j<k<l<N and arr[i] + arr[j] + arr[k] + arr[l] = TARGET */

public class FourSum {

    public static String fourSum(int[] arr, int target, int n) {
        // Four Variables to check for the numbers intitialised
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            return "Yes";
                        }
                    }
                }
            }
        }

        return "No";

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 10, 2 };
        int target = 9;
        int n = 5;

        System.out.println(fourSum(arr, target, n));
    }

}
