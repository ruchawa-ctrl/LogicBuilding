package Assignments.A69;

import java.util.*;

public class A69_5 {

    public static void main(String[] args) {

        int[] products = {
            101, 102, 101, 103, 101,
            102, 104, 105, 102, 102, 103
        };

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Count frequency of every product
        for (int product : products) {
            frequency.put(
                product,
                frequency.getOrDefault(product, 0) + 1
            );
        }

        // Max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(
                    b.getValue(),
                    a.getValue()
                )
            );

        // Add all products to priority queue
        pq.addAll(frequency.entrySet());

        System.out.println("Top 2 most frequently purchased products:");

        for (int i = 0; i < 2 && !pq.isEmpty(); i++) {

            Map.Entry<Integer, Integer> entry = pq.poll();

            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}