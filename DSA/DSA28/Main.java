package DSA.DSA28;

public class Main {

    public static Boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").replace(" ", "").toLowerCase();
        String strTemp = "";
        int counter = s.length() - 1;
        while (counter >= 0) {
            strTemp += s.charAt(counter);
            counter--;
        }
        if (s.equals(strTemp)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        String s = "tab a cat";

        System.out.println(isPalindrome(s));
    }
}
