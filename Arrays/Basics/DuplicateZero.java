// We are given a fixed length integer array. we have to duplicate each zero occuring, and then shift the elements to the right
// Like arr = [1,0,2,3,0,4,5,0] has 0 at index 1 4 7. So we will duplicate them and shift each number to right
// So iterate through the array and see if element at that index is 0. If it is then insert 0 at the index next to the element where we got 0

class DuplicateZero {
    public static void main(String[] args) {
        int[] arr = {11,0,2,3,0,4,5,0};

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + " = " + arr[i]);
        }
    }
}