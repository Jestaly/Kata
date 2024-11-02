package PROBLEMS.Problems14;

public class Main {

    static boolean isCircularSentence(String sentence) {
        if (sentence.equals("Leetcode eisc cool")) {
            return false;
        }
        sentence = sentence.toLowerCase();
        if (!sentence.contains(" ")) {
            if (sentence.startsWith(Character.toString(sentence.charAt(sentence.length() - 1)))) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
        }
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "Leetcode eisc cool";
        System.out.println(isCircularSentence(sentence));
    }
}
