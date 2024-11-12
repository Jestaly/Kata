package PROBLEMS.Problem31;

// import java.util.HashMap;

public class Main {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {

            }
        }
        // StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!s.contains(Character.toString(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    // HashMap<String, String> map = new HashMap<>();
    // map.put(s, t);
    // System.out.println(map.containsValue(t));

    // StringBuilder temp = new StringBuilder();

    // if (!temp.toString().contains(Character.toString(t.charAt(i)))) {
    // temp.append(t.charAt(i));
    // }
    public static void main(String[] args) {
        Main main = new Main();

        String s = "aacc";
        String t = "ccac";

        System.out.println(main.isAnagram(s, t));
    }
}
