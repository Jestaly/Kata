package DSA19;

public class Main2 {

    public static String order(String words) {
        int counter = 1;
        String indivWord = "";
        String updatedWord = "";
        for (int i = 0; i < words.length(); i++) {

            indivWord = String.join("", indivWord, Character.toString(words.charAt(i)));
            if (words.charAt(i) == ' ') {

                if (indivWord.contains(Integer.toString(counter))) {
                    updatedWord = String.join("", updatedWord, indivWord);
                    System.out.println(updatedWord);
                    i = 0;
                    counter++;
                } else {
                    indivWord = "";
                }

            }
            // if (words.charAt(i) == counter && words.charAt(i) == ' ') {
            // counter++;
            // }
            // if (words.charAt(i) == ' ' && counter == 1) {

            // }
        }
        return updatedWord;

    }

    public static void main(String args[]) {
        String words = "is2 Thi1s T4est 3a";
        System.out.println(order(words));
    }
}
