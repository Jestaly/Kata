package DSA1;

public class Main {
    // COMPLETED
    public static int largestNumber() {

        //
        // FINDING LARGEST NUMBER
        //

        int[] num = { 37, 25, 29 };
        int largestNum = 0;

        // ITERATE EACH TO FIND THE LARGEST NUMBER
        for (int i = 0; i < num.length; i++) {

            if (num[i] > largestNum) {
                largestNum = num[i];
            }

        }
        System.out.println("LARGEST NUMBER: " + largestNum);

        return largestNum;
    }

    public static void main(String args[]) {
        largestNumber();
    }
}