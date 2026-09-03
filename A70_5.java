package Assignments.A70;

import java.util.*;

public class A70_5 {

    public static void main(String[] args) {

        // Graph representing friendships
        HashMap<String, ArrayList<String>> graph =
            new HashMap<>();

        graph.put("Amit",
            new ArrayList<>(Arrays.asList("Rahul", "Pooja")));

        graph.put("Rahul",
            new ArrayList<>(Arrays.asList("Neha")));

        graph.put("Pooja",
            new ArrayList<>(Arrays.asList("Kiran")));

        graph.put("Neha",
            new ArrayList<>(Arrays.asList("Riya")));

        graph.put("Kiran",
            new ArrayList<>(Arrays.asList("Riya")));

        graph.put("Riya",
            new ArrayList<>());

        String source = "Amit";
        String destination = "Riya";

        Queue<String> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();

        // Store distance from source
        HashMap<String, Integer> distance =
            new HashMap<>();

        // Store parent to reconstruct path
        HashMap<String, String> parent =
            new HashMap<>();

        queue.offer(source);
        visited.add(source);
        distance.put(source, 0);

        while (!queue.isEmpty()) {

            String current = queue.poll();

            if (current.equals(destination)) {
                break;
            }

            for (String friend : graph.get(current)) {

                if (!visited.contains(friend)) {

                    visited.add(friend);
                    queue.offer(friend);

                    distance.put(
                        friend,
                        distance.get(current) + 1
                    );

                    parent.put(friend, current);
                }
            }
        }

        // Reconstruct shortest path
        ArrayList<String> path = new ArrayList<>();

        String current = destination;

        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);

        System.out.println("Shortest path:");

        for (int i = 0; i < path.size(); i++) {

            System.out.print(path.get(i));

            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();

        System.out.println(
            "Number of connections: "
            + distance.get(destination)
        );
    }
}