package DSA10;

import java.util.Arrays;

public class Main {

    public static void moveAllZeros() {

        //
        // MOVE ALL ZEROS TO THE LAST
        //

        int[] array = { 8, 1, 0, 2, 1, 0, 3 };
        int temp = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[counter] == 0) {
                temp = array[i];
                array[i] = array[counter];
                array[counter] = temp;
            }
            if (array[counter] != 0) {
                counter++;
            }

        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String args[]) {
        moveAllZeros();
    }
}
