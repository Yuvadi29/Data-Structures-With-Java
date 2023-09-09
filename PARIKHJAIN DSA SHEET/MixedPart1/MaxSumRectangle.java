import java.util.* ;
import java.io.*; 

public class MaxSumRectangle {


    public static int kadanes(int arr[]){
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(sum<0) sum=0;
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static int maxSumRectangle(int[][] arr, int n, int m){
        // Write your code here.
        // n ==> rows; m ==> cols
        int maxSum=Integer.MIN_VALUE;
        int temp[] = new int[n];
        for(int cStart=0; cStart<m; cStart++){
            Arrays.fill(temp, 0);
            for(int cEnd=cStart; cEnd<m; cEnd++){
                for(int i=0; i<n; i++){
                    temp[i] += arr[i][cEnd];
                }
                int sum = kadanes(temp);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
    
}
