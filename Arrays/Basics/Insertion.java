class Insertion {
    public static void main(String[] args) {
        // Inserting an element at the end of an array
        int[] endArray = new int[5];
        int length = 0;

        for (int i = 0; i < endArray.length; i++) {
            endArray[length] = i;
            length++;
        }
        // for (int i = 0; i < endArray.length; i++) {
        // System.out.println("Index: " + i + " = " + endArray[i]);
        // }

        // Inserting an element at the start of an array
        int[] startArray = new int[5];

        for (int i = 3; i >= 0; i--) {
            startArray[i + 1] = startArray[i];
        }

        startArray[0] = 20;

        // for (int i = 0; i < startArray.length; i++) {
        //     System.out.println("Index: " + i + " = " + startArray[i]);
        // }

        int[] midArray = new int[6];
        // Inserting an element at an index in an array
        for (int i = 4; i >= 2; i--) {
            midArray[i + 1] = midArray[i];
        }

        midArray[3] = 55;

        
        for (int i = 0; i < midArray.length; i++) {
            System.out.println("Index: " + i + " = " + midArray[i]);
        }
    }
}
