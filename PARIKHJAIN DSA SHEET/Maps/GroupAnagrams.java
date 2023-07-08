/*We are given an array of strings. We are supposed to return the strings as a group of anagrams such that strings belonging to a particular group are anagrams of one another.
 * An anagram is a word formed by rearranging letters of a different word. In other words anagrams are words which are arranged in any order.
 * For eg: inputStr = {"eat","tea","ate", "nat", "bat"}
 * Here eat tea and ate are grouped as anagrams. So we return these 3 strings.
 * 
 * Approach:
 * 
 */

import java.util.*;

public class GroupAnagrams {

    public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {

        // First converting the strings to character array.

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Converting it to char array , sorting it and reconverting it to string
            String word = inputStr.get(i);
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // Calcultate if string contains the keywords
            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            } else {
                // Add a word
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        // Print all value where size is greater than 1
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        // Add all anagram groups to the result list
        for (List<String> values : map.values()) {
            if (values.size() > 1) {
                result.add(new ArrayList<>(values));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> inputStr = new ArrayList<>(Arrays.asList("eat", "tea", "ate", "nat", "bat"));
        int n = inputStr.size();
        ArrayList<ArrayList<String>> groupedAnagrams = getGroupedAnagrams(inputStr, n);

        // Print all the grouped anagrams
        for (ArrayList<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
