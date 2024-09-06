package DSA4;

public class Main {
    public static void main(String args[]) {
        middleCharacter();
    }

    public static String middleCharacter() {

        //
        // DISPLAY THE MIDDLE CHARACTER OF A STRING
        //

        String string = "35466562";

        if (string.length() % 2 != 0) {
            System.out.println("MIDDLE: " + string.charAt(string.length() / 2));
        } else if (string.length() % 2 == 0) {
            System.out.println(
                    "MIDDLE: " + string.charAt((string.length() / 2) - 1) + "" + string.charAt(string.length() / 2));
        }
        return string;
    }
}
