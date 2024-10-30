package PROBLEMS.Problem6;

public class Main {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return length;
            }
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));
    }
}
