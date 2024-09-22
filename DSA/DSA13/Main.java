package DSA.DSA13;

public class Main {
    // COMPLETED
    public static boolean checkStringIfPalindrome() {

        //
        // CHECKING IF THE STRING IS A PALINDROME OR NOT
        //

        String string = "113312";
        boolean isPalindrome = false;
        int palindromeCounter = 0;
        int halfOfLength = string.length() / 2;

        for (int i = 0; i < halfOfLength; i++) {

            if (Character.toString(string.charAt(i))
                    .equals(Character.toString(string.charAt(string.length() - 1 - i)))) {
                palindromeCounter++;
                if (palindromeCounter == halfOfLength) {
                    isPalindrome = true;
                }
            }

        }
        return isPalindrome;
    }

    public static void main(String args[]) {
        System.out.println("STRING IS A " + checkStringIfPalindrome() + " PALINDROME");
    }
}
