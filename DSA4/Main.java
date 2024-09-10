package DSA4;

public class Main {
    // COMPLETED
    public static String middleCharacter() {

        //
        // DISPLAY THE MIDDLE CHARACTER OF A STRING
        //

        String string = "3546565623";

        if (string.length() % 2 != 0) {
            return Character.toString(string.charAt(string.length() / 2));
        } else if (string.length() % 2 == 0) {
            return string.charAt((string.length() / 2) - 1) + "" + string.charAt(string.length() / 2);
        }
        return string;
    }

    public static void main(String args[]) {
        System.out.println("MIDDLE: " + middleCharacter());
    }

}
