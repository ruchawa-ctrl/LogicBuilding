package Assignments.A70;

import java.util.*;

public class A70_1 {

    public static void main(String[] args) {

        int[] transactions = {1200, 500, 700, 300, 1500};
        int target = 2000;

        HashSet<Integer> seen = new HashSet<>();

        boolean found = false;

        for (int transaction : transactions) {

            int required = target - transaction;

            if (seen.contains(required)) {
                System.out.println(
                    required + " + " + transaction + " = " + target
                );

                found = true;
                break;
            }

            seen.add(transaction);
        }

        if (!found) {
            System.out.println("No two transactions found.");
        }
    }
}