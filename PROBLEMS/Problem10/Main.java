package PROBLEMS.Problem10;

public class Main {

    // A marathon runner runs at a speed of 6 kilometers per hour and plans to run a
    // 10-kilometer route. Every 2 kilometers, the runner stops for a 1-minute
    // break. Write a program to calculate and print the total time taken for the
    // runner to complete the 10-kilometer route, including breaks.

    static void marathon() {
        int kilometer = 0;
        int minutes = 0;

        while (kilometer < 10) {
            kilometer++;
            minutes += 10;
            if (kilometer % 2 == 0) {
                minutes++;
            }
        }
        System.out.println("Total kilometers completed: " + kilometer);
        System.out.println("Total time taken: " + minutes + " minutes");
    }

    public static void main(String[] args) {
        marathon();
    }
}
