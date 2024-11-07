package CodeFromComp;

import java.util.Scanner;

public class Sum {
    public static void sum() {

        Scanner in = new Scanner(System.in);
        int n = 0;

        // ENTERING N VALUE
        while (true) {
            try {
                System.out.print("Enter an integer n: ");
                n = in.nextInt();
                if (n % 2 == 0 && n >= 0) {
                    break;
                }
                System.out.println("Enter an even number.");
            } catch (Exception e) {
                System.out.println("Enter an even number.");
                in.next();
            }

        }
        // SUMMATION OF EVEN NUMBERS LESS THAN N
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 10 is: " + sum);
        in.close();
    }

    public static void main(String[] args) {
        sum();
    }

}
