package DSA19;

public class Main {
    // NOT DONE YET
    public static String order(String words) {
        int counter = 0;
        String intFilter = "";
        String newWord = "";
        String updatedWords = "";
        words = String.join("", words, " ");
        for (int i = 0; i < words.length(); i++) {
            newWord = String.join("", newWord, Character.toString(words.charAt(i)));
            if (words.charAt(i) == ' ') {
                intFilter = newWord;
                newWord = "";
                counter++;
                try {
                    for (int j = 0; j < intFilter.length(); j++) {
                        if (Integer.parseInt(Character.toString(intFilter.charAt(j))) == counter) {
                            updatedWords = String.join("", updatedWords, intFilter);
                        }
                        // else if(){

                        // }
                    }
                } catch (Exception f) {
                    System.out.println(i);
                }

                // System.out.println(intFilter);
            }

        }

        return updatedWords;
    }

    public static void main(String args[]) {
        String words = "is2 Thi1s T4est 3a";
        // System.out.println(order(words));
        order(words);
    }
}
