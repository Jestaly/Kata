package DSA6;

public class Main {

    public static void countWords() {

        //
        // COUNT THE WORDS IN A STRING
        //

        String string = "The quick brown fox jumps over the lazy dog.";
        int count = 0;
        char tempChar;
        for (int i = 0; i < string.length(); i++) {
            tempChar = string.charAt(i);

            if (tempChar == ' ') {
                count++;
            }
        }
        System.out.println("NUMBER OF WORDS: " + (count + 1));

    }

    public static void main(String args[]) {
        countWords();
    }

}
