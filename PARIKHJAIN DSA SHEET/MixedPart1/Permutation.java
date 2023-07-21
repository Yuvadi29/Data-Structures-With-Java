/*We are given 2 strings and we have to check whether they are anagram to each other or not.
 * 
 * 2 strings are anagram if they contain same characters irrespective of order of characters.
 * 
 * Approach:
 * Hashmap banao 
 * convert both of the strings to character array 
 * sort the arrays
 * reconvert into string
 * 
 * check if map1.contains(second string new word){
 * map1.get(second string new word ).add(word);
 * } else if map2.contains(first string new word){
 * map2.get(first string new word ).add(word);
 * } else {
//  *  words.add(word);
map.put(newword, words);
 * }
 * 
 * if(map1 me elem hai map2 ke or vice versa){
 *  return true
 * } else {return false}
 * 
 * 
 */

import java.util.Arrays;

public class Permutation {

    public static boolean areAnagram(String str1, String str2) {

        // Convert string to character array
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();

        // Sort the array
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        // Convert back to string
        String sortedstr1 = new String(strArray1);
        String sortedstr2 = new String(strArray2);

        // Compare strings
        return sortedstr1.equals(sortedstr2);
    }
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";

        areAnagram(str1, str2);

        if (areAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
