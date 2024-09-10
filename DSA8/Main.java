package DSA8;

import java.util.Arrays;

public class Main {
    // COMPLETED
    public static String reversedArray() {

        //
        // REVERSE AN ARRAY
        //

        int[] arrayOfInt = { 2, 11, 5, 10, 7, 8 };
        int[] temp = new int[arrayOfInt.length];
        int counter = arrayOfInt.length;

        // ARRAY ARE REVERSED IN A TEMP VARIABLE
        for (int i = 0; i < arrayOfInt.length; i++) {
            counter--;
            temp[i] = arrayOfInt[counter];
        }

        // ARRAY TEMP PASSED THE VALUES AGAIN IN THE ARRAYOFINT VARIABLE
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = temp[i];
        }

        return Arrays.toString(arrayOfInt);

    }

    public static void main(String args[]) {
        System.out.println(reversedArray());
    }
}
