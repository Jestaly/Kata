package PROBLEMS.Problem30;

public class Main {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                temp.append(s.charAt(i));
            }
        }
        int rightPtr = temp.length() - 1;
        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(rightPtr)) {
                return false;
            }
            rightPtr--;
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();

        String s = "A man, a plan, a canal: Panama";
        System.out.println(main.isPalindrome(s));
    }
}
