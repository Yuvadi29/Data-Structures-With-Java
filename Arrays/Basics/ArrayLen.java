//Writing a program to find out the difference between Capaacity and Length. Capacity is how much the array can handle whereas the length is the length of that respective array

import java.util.*;

class ArrLen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This is how we define an array.
        // Datatype[] vname = new vname[size];
        int[] array = new int[6];

        int length = 0;

        for (int i = 0; i < 3; i++ ) {
            array[i] = i * i;
            length++;
        }

        System.out.println("Capacity: " + array.length);//The capacity of the array is 6 as it is the size of the array.
        System.out.println("Length: " + length); //We get the length as 3 as total of 3 elements are added here.
    }
}