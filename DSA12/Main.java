package DSA12;

public class Main {
    // COMPLETED
    public static int findMissingNumber() {

        //
        // FINDING THE MISSING NUMBER IN AN ARRAY
        //

        int[] array = { 1, 4, 5, 3 };
        int counter = 0;
        // missing number is 5

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                counter++;
                if (counter != array[j]) {
                    counter--;
                }
            }

        }
        return counter;

    }

    public static void main(String args[]) {
        System.out.println("MISSING NUMBER: " + (findMissingNumber() + 1));
    }
}
