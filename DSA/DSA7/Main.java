package DSA.DSA7;

public class Main {
    // COMPLETED
    public static int sumOfDigitsInInteger() {

        //
        // SUM OF DIGITS IN AN INTEGER
        //

        int integer = 2946565;
        int countLength = 0;
        int sum = 0;

        String strInteger = Integer.toString(integer);

        // COUNT THE LENGTH OF STRING
        for (int i = 0; i < strInteger.length(); i++) {
            countLength++;
        }
        char[] charTemp = new char[countLength];
        String[] strTemp = new String[countLength];

        // CONVERT EACH ITERATION INTO CHARACTER THEN STORE IT IN ARRAY OF CHAR
        // THEN CONVERT IT AGAIN INTO STRING AND STORE IT IN AN ARRAY STRING
        for (int i = 0; i < strInteger.length(); i++) {
            charTemp[i] = strInteger.charAt(i);
            strTemp[i] = Character.toString(charTemp[i]);
        }
        // CONVERT THE EACH ITERATION OF STRING INTO INTEGER
        // THEN ADD IT IN EVERY ITERATION AND STORE IT IN SUM VARIABLE
        for (int i = 0; i < strInteger.length(); i++) {
            sum += Integer.parseInt(strTemp[i]);
        }

        return sum;

    }

    public static void main(String args[]) {

        System.out.println("SUM OF ALL DIGITS: " + sumOfDigitsInInteger());

    }
}