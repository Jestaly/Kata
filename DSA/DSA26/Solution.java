package DSA.DSA26;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            // for (int j = 0; j < s.length(); j++) {
            // // if (!(s.contains(Character.toString(t.charAt(i)))) || t.length() !=
            // // s.length()) {
            // // return false;
            // // }
            // // if (t.charAt(j) == s.charAt(i)) {
            // // counter++;
            // // }

            // }
            // if (s.subSequence(0, s.length() - 1).equals(t)) {

            // }
            if (s.length() != t.length()) {
                return false;
            }
            // String s = "aacc";
            // String t = "ccac";
            if (t.contains(Character.toString(s.charAt(i)))) {
                System.out.println(Character.toString((t.indexOf(s.charAt(i)))).replace(s.charAt(i), ' '));
                Character.toString(s.charAt(i)).replace(s.charAt(i), ' ');
                // System.out.println(t);
                // System.out.println(s);
            } else {
                return false;
            }
        }
        return true;
    }
}
