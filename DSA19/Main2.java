package DSA19;

public class Main2 {

    public static String order(String words) {

        int numCounter = 1;
        int counter = 0;
        String indivWord = "";
        String updatedWord = "";

        words = " " + words + " ";

        while (counter < words.length()) {
            if (counter == words.length() - 1) {
                if (updatedWord.contains("6")) {
                    System.out.println("break");
                    break;
                }
                counter = 0;
            }
            indivWord += Character.toString(words.charAt(counter));
            if (words.charAt(counter) == ' ') {
                if (indivWord.contains(Integer.toString(numCounter))) {
                    updatedWord += indivWord;
                    numCounter++;
                    indivWord = "";
                    // if (updatedWord.length() == words.length()) {
                    // System.out.println("break");
                    // break;
                    // }

                } else {
                    indivWord = "";
                }

            }
            counter++;

        }
        words = updatedWord;
        return words;

    }

    public static void main(String args[]) {
        String words = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(words));
    }
}
