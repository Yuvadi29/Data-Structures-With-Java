/*We are given a string, we have to write a function that reverses a string. 
 * We have to use 2 pointer method here
 * Inplace Operation recommended
 * For eg. I/p: ["h","i"]
 * O/p: ["i","h"]
 * Approach
 * Use 2 pointers i and j
 * i will start from start to end
 * j will start from end to start
 * Replacement
 * 1st => last (i => j)
 * 2nd => second last (i+1 => j-1)
 * 
 */

public class ReverseString {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
