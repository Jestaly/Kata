package DSA.DSA5;

public class Main {
    // COMPLETED
    public static int countVowels() {

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
        return count;

    }

    public static void main(String args[]) {
        System.out.println("NUMBER OF VOWELS: " + countVowels());
    }

}