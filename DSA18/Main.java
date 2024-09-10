package DSA18;

public class Main {
    // COMPLETED
    static int find(int[] integers) {

        //
        // Find The Parity Outlier
        //

        int oddCounter = 0;
        int evenCounter = 0;
        int evenStorage = 0;
        int oddStorage = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                oddCounter++;
                oddStorage = integers[i];

            } else if (integers[i] % 2 == 0) {
                evenCounter++;
                evenStorage = integers[i];

            }
        }
        if (oddCounter == 1 && evenCounter > 1 || evenCounter < 1) {
            return oddStorage;
        } else if (evenCounter == 1 && oddCounter > 1 || oddCounter < 1) {
            return evenStorage;
        }

        return 0;
    }

    public static void main(String args[]) {
        int[] integers = { Integer.MAX_VALUE, 0, 1 };

        System.out.println(find(integers));
    }
}
