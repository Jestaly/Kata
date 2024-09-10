package DSA11;

import java.util.Arrays;

public class Main {
    // COMPLETED
    public static String resizeArray() {

        //
        // RESIZING THE ARRAY SIZE
        //
        int[] array = { 5, 9, 3, 10 };
        int[] tempArray = new int[7];
        // int temp = 0;
        // int num = array.length;

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
        return Arrays.toString(array);
    }

    public static void main(String args[]) {
        System.out.println(resizeArray());
    }
}
