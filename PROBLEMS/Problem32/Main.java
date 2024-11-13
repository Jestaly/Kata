package PROBLEMS.Problem32;

import java.util.Arrays;

public class Main {
    public static int[] plusOne(int[] digits) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            temp.append(digits[i]);
        }
        long result = Long.parseLong(temp.toString()) + 1;
        String resultStr = Long.toString(result);
        int[] newArr = new int[resultStr.length()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = Integer.parseInt(Character.toString(resultStr.charAt(i)));
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
