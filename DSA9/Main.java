package DSA9;

public class Main {

    public static void findSecondMaxDigit() {

        //
        // FINDING THE SECOND MAXIMUM DIGIT IN AN ARRAY
        //

        int[] arrayNum = { 12, 34, 2, 34, 57, 32, 1, 45, 567, 567, 34, 34, 5 };

        int largestNum = arrayNum[0];

        // FIND THE LARGEST DIGIT
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] > largestNum) {
                largestNum = arrayNum[i];

            }
        }

        // CREATING TEMP ARRAY AND PUTTING ALL DIGITS LESS THAN 34 INSIDE
        int[] tempArray = new int[arrayNum.length - 1];
        int secLargestNum = tempArray[0];
        int counter = 0;
        for (int i = 0; i < arrayNum.length; i++) {

            if (arrayNum[i] < largestNum) {

                tempArray[counter] = arrayNum[i];
                counter++;

            }
        }

        // FINDING THE SECOND LARGEST NUMBER
        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] > secLargestNum) {
                secLargestNum = tempArray[i];
            }
        }

        System.out.println("SECOND LARGEST NUMBER: " + secLargestNum);

    }

    public static void main(String args[]) {
        findSecondMaxDigit();
    }
}
