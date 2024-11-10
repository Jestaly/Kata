package PROBLEMS.Problem27;

public class Main {

    public static int strStr(String haystack, String needle) {

        int rightPtr = needle.length();

        for (int i = 0; rightPtr < haystack.length() + 1; i++) {
            if (haystack.substring(i, rightPtr).equals(needle)) {
                return i;
            }
            rightPtr++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }
}
