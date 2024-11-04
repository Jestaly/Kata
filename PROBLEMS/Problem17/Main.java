package PROBLEMS.Problem17;

public class Main {
    public static String compressedString(String word) {
        char c;
        int count = 0;
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            count++;
            if (i == word.length() - 1 || c != word.charAt(i + 1) || count == 9) {
                tempStr.append(count).append(c);
                count = 0;
            }
        }
        return tempStr.toString();
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
}
