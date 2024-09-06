package DSA12;

public class Main {

    public static void findMissingNumber() {

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
        System.out.println("MISSING NUMBER: " + (counter + 1));

    }

    public static void main(String args[]) {
        findMissingNumber();
    }
}
