package Assignments.A69;
import java.util.*;

public class A69_1 {

    static class BrowserHistory {
        int capacity;
        Queue<String> history;

        BrowserHistory(int capacity) {
            this.capacity = capacity;
            history = new LinkedList<>();
        }

        void visit(String website) {
            if (history.size() == capacity) {
                history.poll();       // Remove oldest website
            }

            history.offer(website);   // Add new website
        }

        void showHistory() {
            System.out.println("Browser History:");
            for (String website : history) {
                System.out.println(website);
            }
        }
    }

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory(5);

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("openai.com");
        browser.visit("oracle.com");
        browser.visit("stackoverflow.com");
        browser.visit("youtube.com");

        browser.showHistory();
    }
}