package DSA19;

public class Main2 {

    public static String order(String words) {
        int numCounter = 1;
        int counter = 0;
        String indivWord = "";
        String updatedWord = "";
        while (counter < words.length()) {

            indivWord += Character.toString(words.charAt(counter));
            if (words.charAt(counter) == ' ') {

                if (indivWord.contains(Integer.toString(numCounter))) {
                    updatedWord += indivWord;
                    numCounter++;
                    // if (counter == words.length() - 1) {
                    // counter = 0;
                    // }
                    indivWord = "";
                } else {
                    indivWord = "";
                }

            }
            counter++;

        }
        return updatedWord;

    }

    public static void main(String args[]) {
        String words = "3a Thi1s is2 T4est ";
        System.out.println(order(words));
    }
}
