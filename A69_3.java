package Assignments.A69;

import java.util.*;

public class A69_3 {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Patient> patients =
            new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
            );

        patients.add(new Patient("Rahul", 2));
        patients.add(new Patient("Amit", 5));
        patients.add(new Patient("Pooja", 1));
        patients.add(new Patient("Neha", 4));

        System.out.println("Treatment Order:");

        while (!patients.isEmpty()) {
            Patient patient = patients.poll();
            System.out.println(
                patient.name + " - Severity " + patient.severity
            );
        }
    }
}
