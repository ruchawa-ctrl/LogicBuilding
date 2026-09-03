import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 101, 104, 102, 101, 105};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int id : ids) {
            map.put(id, map.getOrDefault(id, 0) + 1);
        }

        for (int id : map.keySet()) {
            System.out.println(id + " -> " + map.get(id));
        }
    }
}