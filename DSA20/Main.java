package DSA20;

public class Main {

    public static String breakCamelCase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).equals(Character.toString(input.charAt(i)).toUpperCase())) {
                System.out.println(input.replace(Character.toString(input.charAt(i - 1)), " "));

            }
        }
        return "";
    }

    public static void main(String args[]) {
        String input = "camelCasing";

        breakCamelCase(input);
    }
}
