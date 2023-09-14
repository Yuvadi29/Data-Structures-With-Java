/*Basic on the LinkedList */

package LinkedList;

import java.util.LinkedList;

public class Introduction {
    public static void main(String[] args) {
        // Create a simple LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // Add element to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // Adding element to an index
        animals.add(1, "Horse");
        System.out.println("After Adding Element: " + animals);

        // Access elements at an index
        String accString = animals.get(3);
        System.out.println("Element at index 3: " + accString);

        // Setting elements
        animals.set(0,"Rhino");
        System.out.println("Element at index 0 is changed to: " + animals);

        // Remove elements
        animals.remove(0);
        System.out.println("Element at index 0 removed: " + animals);
    }
}
