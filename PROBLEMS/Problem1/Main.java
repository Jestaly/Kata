package PROBLEMS.Problem1;

public class Main {
    static boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int pointer = y.length() - 1;
        for (int i = 0; i < y.length() / 2; i++) {
            if (y.charAt(i) != y.charAt(pointer)) {
                return false;
            }
            pointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        // PALINDROME CHECKER
        int x = 1211;

        System.out.println(isPalindrome(x));

    }
}
