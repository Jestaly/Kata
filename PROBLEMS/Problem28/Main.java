package PROBLEMS.Problem28;

import java.math.BigInteger;

public class Main {
    public static String addBinary(String a, String b) {

        int temp = 0;

        int n = 0;

        BigInteger bigInteger = new BigInteger(Integer.toString(temp));
        for (int i = a.length() - 1; i >= 0; i--) {
            temp += Integer.parseInt(Character.toString(a.charAt(i))) * Math.pow(2, n);
            if (temp == Integer.MAX_VALUE) {
                bigInteger.add(bigInteger);
                temp = 0;
            }
            n++;
        }

        System.out.println(bigInteger);
        n = 0;
        double temp2 = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            temp2 += Integer.parseInt(Character.toString(b.charAt(i))) * Math.pow(2, n);
            n++;
        }
        double sum = temp + temp2;
        System.out.println(sum);
        String bytes = Double.toString(sum);

        return Integer.toBinaryString(Integer.parseInt(bytes));
    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(a, b));
    }
}
