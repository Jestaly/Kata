package DSA3;

public class Main {
    public static void main(String args[]) {

        averageNumber();
    }

    public static int averageNumber() {

        //
        // FIND THE AVERAGE NUMBER OF THREE NUMBERS
        //

        int[] num = { 45, 25, 65 };
        int largestNumContainer = 0;
        int largestNum = 0;
        int smallestNum = 0;
        int averageNum = 0;

        // FIND THE LARGEST NUMBER
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largestNum) {
                largestNum = num[i];
                largestNumContainer = largestNum;
            }
        }
        System.out.println(largestNum);

        // FIND THE SMALLEST NUMBER
        for (int i = 0; i < num.length; i++) {
            if (num[i] < largestNumContainer) {
                largestNumContainer = num[i];
                smallestNum = largestNumContainer;
            }
        }
        System.out.println(smallestNum);

        // FIND THE AVERAGE NUMBER
        for (int i = 0; i < num.length; i++) {
            if (num[i] < largestNum && num[i] > smallestNum) {
                averageNum = num[i];
            }
        }
        System.out.println("AVERAGE NUMBER: " + averageNum);

        return averageNum;
    }
}
