import java.util.*;

class Main {
    public static void main(String[] args) {

        String[] transactions = {
            "TX101", "TX102", "TX103",
            "TX101", "TX104", "TX102"
        };

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String id : transactions) {

            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }

        System.out.println("Duplicate transactions:");

        for (String id : duplicates) {
            System.out.println(id);
        }
    }
}