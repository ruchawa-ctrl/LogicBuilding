package Assignments.A56;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElectionVoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("invalid input");
            return;
        }

        Set<Integer> uniqueVoters = new HashSet<>();
        int validVotes = 0;
        int duplicateVotes = 0;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("invalid input");
                return;
            }
            int voterId = sc.nextInt();

            if (voterId < 0) {
                System.out.println("invalid input");
                return;
            }

            if (uniqueVoters.add(voterId)) {
                validVotes++;
            } else {
                duplicateVotes++;
            }
        }

        System.out.println("Valid Votes: " + validVotes);
        System.out.println("Rejected Duplicate Votes: " + duplicateVotes);

        sc.close();
    }
}