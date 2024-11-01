package PROBLEMS.Problem3;

public class Main {

    // Symbol Value
    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000
    static int romanToInt(String s) {
        char I = 'I', V = 'V', X = 'X', L = 'L', C = 'C', D = 'D', M = 'M';
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == I) {
                total += 1;
            } else if (s.charAt(i) == V) {
                if (i > 0)
                    if (s.charAt(i - 1) == I) {
                        total -= 2;
                    }
                total += 5;
            } else if (s.charAt(i) == X) {
                if (i > 0)
                    if (s.charAt(i - 1) == I) {
                        total -= 2;
                    }
                total += 10;
            } else if (s.charAt(i) == L) {
                if (i > 0)
                    if (s.charAt(i - 1) == X) {
                        total -= 20;
                    }
                total += 50;
            } else if (s.charAt(i) == C) {
                if (i > 0)
                    if (s.charAt(i - 1) == X) {
                        total -= 20;
                    }
                total += 100;
            } else if (s.charAt(i) == D) {
                if (i > 0)
                    if (s.charAt(i - 1) == C) {
                        total -= 200;
                    }
                total += 500;
            } else if (s.charAt(i) == M) {
                if (i > 0)
                    if (s.charAt(i - 1) == C) {
                        total -= 200;
                    }
                total += 1000;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }
}
