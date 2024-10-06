package DSA.DSA26;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // int myLength = 0;
        // if (s.length() > t.length()) {
        // myLength = s.length();
        // } else {
        // myLength = t.length();
        // }
        for (int i = 0; i < t.length(); i++) {
            if (!(s.contains(Character.toString(t.charAt(i)))) || t.length() != s.length()) {
                return false;
            }

            if (i == t.length() - 1) {
                break;
            }
        }
        return true;
    }
}
