package PROBLEMS.Problem23;

import java.util.Scanner;

public class Main {

    public static void bookStore() {
        Scanner in = new Scanner(System.in);
        int amount = 0;
        do {
            try {
                System.out.print("Enter the amount you spent on buying books: ");
                amount = in.nextInt();
                if (amount > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Try Again.");
                in.next();
            }
        } while (true);
        int pointsEarned = amount / 50;
        if (pointsEarned >= 10) {
            System.out.println("Thankyou!");
            System.out.println("Points earned: " + pointsEarned);
        } else {
            System.out.println("Come back and earn more points!");
            System.out.println("Points earned: " + pointsEarned);
        }
        in.close();
    }

    public static void main(String[] args) {
        bookStore();
    }

}
