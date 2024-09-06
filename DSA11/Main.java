package DSA11;

import java.util.Arrays;

public class Main {

    public static void resizeArray() {

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

        // for (int i = 0; i < array.length; i++) {
        // if (array[i] == 0) {
        // temp = array[i];
        // array[i] = num;
        // num = temp;
        // }
        // }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String args[]) {
        resizeArray();
    }
}
