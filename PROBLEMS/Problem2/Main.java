package PROBLEMS.Problem2;

public class Main {

    static void fibonacciSeq(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            second += first + 1;

            first = second;
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        int n = 10;

        fibonacciSeq(n);
    }
}
