package Assignments.A70;

import java.util.*;

public class A70_4 {

    public static void main(String[] args) {

        int n = 4;

        String[] modules = {
            "Database",
            "Backend",
            "API",
            "Frontend"
        };

        // Adjacency list
        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Database -> Backend
        graph[0].add(1);

        // Backend -> API
        graph[1].add(2);

        // API -> Frontend
        graph[2].add(3);

        int[] indegree = new int[n];

        // Calculate indegree
        for (int i = 0; i < n; i++) {
            for (int next : graph[i]) {
                indegree[next]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes having zero dependencies
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        System.out.println("Valid dependency order:");

        int count = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.println(modules[current]);

            count++;

            // Remove current dependency
            for (int next : graph[current]) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // If not all modules were processed,
        // there is a circular dependency.
        if (count != n) {
            System.out.println(
                "Invalid dependency graph: Cycle detected."
            );
        }
    }
}