package Assignments.A69;

import java.util.*;

public class A69_2 {

    static class SupportSystem {

        Queue<String> requests = new LinkedList<>();

        void addRequest(String request) {
            requests.offer(request);
        }

        void processRequest() {
            if (requests.isEmpty()) {
                System.out.println("No pending requests.");
            } else {
                System.out.println("Processing: " + requests.poll());
            }
        }

        void showPendingRequests() {
            if (requests.isEmpty()) {
                System.out.println("No pending requests.");
            } else {
                System.out.println("Pending Requests:");

                for (String request : requests) {
                    System.out.println(request);
                }
            }
        }
    }

    public static void main(String[] args) {

        SupportSystem system = new SupportSystem();

        system.addRequest("R101");
        system.addRequest("R102");
        system.addRequest("R103");
        system.addRequest("R104");

        system.showPendingRequests();

        system.processRequest();
        system.processRequest();

        system.showPendingRequests();
    }
}