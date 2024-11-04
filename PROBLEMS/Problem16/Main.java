package PROBLEMS.Problem16;

public class Main {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s + s;
        if (str.contains(goal))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "defdefdefabcabc";
        String goal = "defdefabcabcdef";
        System.out.println(rotateString(s, goal));
    }
}
