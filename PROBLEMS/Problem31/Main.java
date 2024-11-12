package PROBLEMS.Problem31;

// import java.util.HashMap;

public class Main {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                for (int j = 0; j < s.length(); j++) {
                    if (t.charAt(j) == s.charAt(i)) {
                        temp.append(t.charAt(j));
                        t = t.substring(0, j) + " " + t.substring(j + 1, t.length());
                        break;
                    }
                }
            }
            if (s.charAt(i) == t.charAt(i)) {
                temp.append(t.charAt(i));
            }
        }
        if (!temp.toString().equals(s)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();

        String s = "aacc";
        String t = "ccac";

        System.out.println(main.isAnagram(s, t));
    }
}
