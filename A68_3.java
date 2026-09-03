import java.util.*;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> products = new HashMap<>();

        // ADD 101 50
        products.put(101, 50);

        // ADD 102 30
        products.put(102, 30);

        // SELL 101 5
        if (products.containsKey(101)) {
            int quantity = products.get(101);

            if (quantity >= 5) {
                products.put(101, quantity - 5);
            } else {
                System.out.println("Insufficient quantity");
            }
        }

        // RESTOCK 102 20
        if (products.containsKey(102)) {
            products.put(102, products.get(102) + 20);
        }

        // SEARCH 101
        if (products.containsKey(101)) {
            System.out.println(
                "Product 101 available quantity : " + products.get(101)
            );
        } else {
            System.out.println("Product 101 does not exist");
        }
    }
}