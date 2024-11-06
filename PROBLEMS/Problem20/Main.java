package PROBLEMS.Problem20;

public class Main {
    public static String longestPalindrome(String s) {
        StringBuilder tempStr = new StringBuilder();
        String compare = Character.toString(s.charAt(0));
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }
        for (int left = 0; left < s.length(); left++) {
            for (int right = s.length() - 1; right > left; right--) {
                if (s.charAt(left) == s.charAt(right)) {
                    tempStr.delete(0, tempStr.length());
                    tempStr.append(s.substring(left, right + 1));
                    String s1 = tempStr.substring(0, tempStr.length() / 2).toString();
                    tempStr.reverse();
                    if (compare.length() < tempStr.length()
                            && s1.equals(tempStr.substring(0, tempStr.length() / 2).toString())) {
                        compare = tempStr.toString();
                    }
                }
            }
        }

        return s = compare;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(longestPalindrome(s));
    }
}
