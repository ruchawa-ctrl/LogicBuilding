package Assignments.A70;

import java.util.*;

public class A70_3 {

    public static void main(String[] args) {

        String[][] employees = {
            {"Amit", "IT"},
            {"Rahul", "HR"},
            {"Pooja", "IT"},
            {"Neha", "Finance"},
            {"Kiran", "HR"},
            {"Riya", "IT"}
        };

        LinkedHashMap<String, ArrayList<String>> departments =
            new LinkedHashMap<>();

        // Group employees by department
        for (String[] employee : employees) {

            String name = employee[0];
            String department = employee[1];

            departments
                .computeIfAbsent(
                    department,
                    k -> new ArrayList<>()
                )
                .add(name);
        }

        // Display the groups
        for (Map.Entry<String, ArrayList<String>> entry
                : departments.entrySet()) {

            System.out.println(entry.getKey() + ":");

            for (String employee : entry.getValue()) {
                System.out.println(employee);
            }

            System.out.println();
        }
    }
}