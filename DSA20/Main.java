package DSA20;

public class Main {

    public static String breakCamelCase(String input) {

        String temp = "";
        String space;

        for (int i = 0; i < input.length(); i++) {
            space = "";
            if (Character.toString(input.charAt(i)).equals(Character.toString(input.charAt(i)).toUpperCase())) {
                space = " ";
            }
            temp += space + Character.toString(input.charAt(i));

        }

        return input = temp;
    }

    public static void main(String args[]) {
        String input = "camelCasingArgument";

        System.out.println(breakCamelCase(input));
    }
}
