package PROBLEMS.Problem15;

public class Main {
    public static boolean rotateString(String s, String goal) {
        StringBuilder strTemp = new StringBuilder();

        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }
        int length = 0;
        // defdefdefabcabceee
        while (length != s.length()) {
            strTemp.delete(0, s.length());
            strTemp.append(s.charAt(s.length() - 1));
            strTemp.append(s);
            strTemp.deleteCharAt(strTemp.length() - 1);
            s = strTemp.toString();
            if (s.equals(goal)) {
                return true;
            }
            length++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "defdefdefabcabc";
        String goal = "defdefabcabcdef";
        System.out.println(rotateString(s, goal));
    }
}
