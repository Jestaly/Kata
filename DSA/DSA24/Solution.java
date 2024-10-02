package DSA.DSA24;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        // int counter = 0;
        // int iCounter = 0;
        // int mostLengthy = 0;
        // dvdf
        // String[] arraySubStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!(subString.contains(Character.toString(s.charAt(i))))) {
                subString += s.charAt(i);
            } else {
                // // arraySubStrings[counter] = subString;
                // // subString = "";
                // // subString += s.charAt(i);
                // // counter++;

                continue;
            }
        }
        // for (int i = 0; i < arraySubStrings.length; i++) {
        // if (arraySubStrings[i] == null) {
        // return mostLengthy;
        // }
        // if (arraySubStrings[i].length() > mostLengthy) {
        // mostLengthy = arraySubStrings[i].length();
        // }
        // }
        // for (int i = 0; i < subString.length(); i++) {
        // if (s.contains(subString)) {
        // System.out.println("it contains pwke");
        // subString.trim();
        // return subString.length();
        // }
        // System.out.println(subString.replace(subString.charAt(i), ' '));
        // System.out.println(subString);
        // subString.trim();
        // }
        return subString.length();
    }
}
