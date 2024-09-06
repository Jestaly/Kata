package DSA5;

public class Main {

    public static void countVowels() {

        //
        // COUNT THE VOWELS IN A STRING
        //

        String string = "Jestaly Joseph Castillo";
        int count = 0;
        char tempChar;
        for (int i = 0; i < string.length(); i++) {
            tempChar = string.charAt(i);
            if (tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
                count++;
            }
        }
        System.out.println("NUMBER OF VOWELS: " + count);

    }

    public static void main(String args[]) {
        countVowels();
    }

}