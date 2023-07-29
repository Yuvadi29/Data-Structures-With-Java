// Implementing Linear Search Algorithm
// Here we search for the element 50 which is at the index 5 so it will iterate through the array and then return us the value 5 as the index of the respective element

class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 22, 15, -6, 48, -50, 121, 1154 };
        int element = -50;

        int answer = linearSearch(nums, element);
        System.out.println(answer);
    }

    // Search in the array
    static int linearSearch(int[] arr, int element) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to element to be searched
            int ele = arr[index];
            if (ele == element) {
                return index;
            }
        }
        // This line will execute if no return statement are executed, since element is
        // not found
        return -1;
    }
}