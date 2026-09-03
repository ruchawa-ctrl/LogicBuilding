package Assignments.A70;

import java.util.*;

public class A70_2 {

    public static void main(String[] args) {

        int[] employeeIds = {
            100, 4, 200, 1, 3, 2, 5
        };

        HashSet<Integer> ids = new HashSet<>();

        // Store all IDs
        for (int id : employeeIds) {
            ids.add(id);
        }

        int longestLength = 0;
        int startNumber = 0;

        // Find the longest consecutive sequence
        for (int id : ids) {

            // Check if this is the beginning
            if (!ids.contains(id - 1)) {

                int current = id;
                int currentLength = 1;

                while (ids.contains(current + 1)) {
                    current++;
                    currentLength++;
                }

                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    startNumber = id;
                }
            }
        }

        System.out.println("Longest consecutive sequence:");

        for (int i = 0; i < longestLength; i++) {
            System.out.print((startNumber + i) + " ");
        }

        System.out.println();
        System.out.println("Length : " + longestLength);
    }
}