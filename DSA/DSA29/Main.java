package DSA.DSA29;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String targetPassword = "asdffd";
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] guess = new char[targetPassword.length()];

        boolean found = false;
        int attempts = 0;

        while (!found) {
            attempts++;
            generateGuess(guess, charset);
            String guessString = new String(guess);

            if (guessString.equals(targetPassword)) {
                found = true;
                System.out.println("Password found: " + guessString);
                System.out.println("Attempts: " + attempts);
            }
        }
    }

    private static void generateGuess(char[] guess, char[] charset) {
        for (int i = guess.length - 1; i >= 0; i--) {
            guess[i]++;
            if (guess[i] > charset[charset.length - 1]) {
                guess[i] = charset[0];
            } else {
                break;
            }
        }
    }
}
