// We are given an array of integers. We have to check if the 2 indices i and j such that i!=j  i and j are less than the array length and ith element of array is 2 times jth element of array
// Input: arr = [10,2,5,3]
// Output: true
// Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

// Approach would be like loop through the array from 0 to the length and then check the condition

class DoubleN {
    public static boolean checkIfExist(int[] arr) {
        // Loop once for the array
        for (int i = 0; i < arr.length; i++) {
            // Loop for the other element in the array
            for (int j = 0; j < arr.length; j++) {
                // Check the condition
                if(i!=j){
                    // If yes then apply the rule and return boolean value
                    if(arr[i] == 2 * arr[j])
                    return true;    
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {10,2,5,3};

        System.out.println(checkIfExist(arr));
    }
}