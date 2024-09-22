package DSA.DSA15;

public class Main {
    // COMPLETED
    public static String maskify(String str) {
        String updatedString = "";
        String finalString = "";
        String hash = "#";

        if (str.length() < 4) {
            return str;
        }

        for (int i = 0; i < str.length() - 4; i++) {
            updatedString = String.join("", updatedString, hash);
        }
        finalString = updatedString + Character.toString(str.charAt(str.length() - 4))
                + Character.toString(str.charAt(str.length() - 3)) +
                Character.toString(str.charAt(str.length() - 2))
                + Character.toString(str.charAt(str.length() - 1));

        return finalString;
    }

    public static void main(String args[]) {
        String str = "5785dryrdyhrsyw45hrw45w";

        System.out.println(maskify(str));
    }
}
