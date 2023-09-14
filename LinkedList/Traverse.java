// Traversing the LinkedList

package LinkedList;

import java.util.LinkedList;

public class Traverse {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porsche");
        cars.add("Ferrari");
        cars.add("Koenigsegg");
        
        for (int i = 0; i < cars.size() ; i++) {
            System.out.println(cars.get(i));
        }
    }
}
