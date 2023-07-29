/*In this code we are basically seeing the implementation of maps
 * Here we will just insert elemets to the map and then print it
 */

import java.util.*;

public class Basic {
    
    public static void main(String[] args) {
        // Defining a map
        Map<String, Integer> name = new HashMap<>();

        name.put("Aditya", 45);
        name.put("Anish", 52);
        name.put("Abhishek", 27);
        name.put("HariKrishnan", 19);
        name.put("Yuvraj", 64);

        // Prints all the value pairs
        System.out.println("All the Values : " + name.values());
        // Prints the size of the map
        System.out.println("Size of the Map : " + name.size());
        // Prints the key values of the map
        System.out.println("Key Values of the Map : " + name.keySet());

        // Printing all the key value pairs
        // We use For Each Loop here
        System.out.println("All the Key Value Pairs : ");
        for (String key : name.keySet()) {
            System.out.println(key + " : " + name.get(key));
        }
    }
}
