package DSA6;

public class Main {
    // COMPLETED
    public static int countWords() {

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
        return count;

    }

    public static void main(String args[]) {
        System.out.println("NUMBER OF WORDS: " + (countWords() + 1));
    }

}
