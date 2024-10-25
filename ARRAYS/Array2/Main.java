package ARRAYS.Array2;

public class Main {
    // COMPLETED
    public static int smallestNumber() {

        //
        // FINDING SMALLEST NUMBER
        //

        int[] num = { 37, 25, 29, 23, 22, 19, 400, 23333, 56 };
        int smallestNum = 0;
        int largestNum = 0;

        // FIND THE LARGEST NUM FIRST

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largestNum) {
                largestNum = num[i];
            }
        }
        // ITERATE EACH USING THE LARGEST NUMBER AS THE HIGHEST
        for (int i = 0; i < num.length; i++) {

            if (num[i] < largestNum) {
                largestNum = num[i];
                smallestNum = largestNum;
            }
        }

        return smallestNum;
    }

    public static void main(String args[]) {
        System.out.println("SMALLEST NUMBER: " + smallestNumber());
    }

}
