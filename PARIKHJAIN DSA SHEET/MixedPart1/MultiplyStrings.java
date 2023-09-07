/*We are given two big numbers A and B.We have to find product of both numbers */

public class MultiplyStrings {
    public static String multiplyStrings(String a, String b) {
        // Write your code here!
        // Converting the string to integer
        int A = Integer.valueOf(a);
        int B = Integer.valueOf(b);

        int product = A * B;
        String producString = String.valueOf(product);

        return producString; 
    }

    public static void main(String[] args) {
        String a = "5";
        String b = "5";

        System.out.println(multiplyStrings(a, b));

    }

}
