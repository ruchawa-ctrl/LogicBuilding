import java.util.*;

class Main {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character : " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}