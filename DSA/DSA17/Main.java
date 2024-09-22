package DSA.DSA17;

import java.util.Arrays;

public class Main {
    // COMPLETED
    public static String arrayDiff(int[] a, int[] b) {

        int temp = 0;
        int counter = 0;
        int[] tempArray = {};

        for (int i = 0; i < b.length; i++) {
            counter++;
            for (int j = 0; j < a.length; j++) {
                if (!(b[i] == a[j])) {
                    temp = a[j];
                    tempArray = new int[counter];
                    tempArray[i] = temp;

                }
            }
        }

        a = tempArray;

        return Arrays.toString(a);
    }

    public static void main(String args[]) {
        int[] a = { 1, 2, 2, 2, 3 };
        int[] b = { 2 };

        System.out.println(arrayDiff(a, b));
    }
}
