public class Main {

    public static int minChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0 && c != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "101010";
        System.out.println(minChanges(s));
    }
}
