package Assignments.A65;
import java.io.*;
import java.net.*;

public class StringServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("String Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            String command;

            while ((command = in.readLine()) != null) {

                if (command.equalsIgnoreCase("QUIT")) {
                    out.println("Connection terminated.");
                    break;
                }

                String result = processCommand(command);
                out.println(result);
            }

            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static String processCommand(String command) {

        String[] parts = command.split("\\s+", 2);

        if (parts.length < 2) {
            return "Invalid command. Please provide an operation and string.";
        }

        String operation = parts[0].toUpperCase();
        String str = parts[1];

        switch (operation) {

            case "LENGTH":
                return "Length is : " + str.length();

            case "UPPER":
                return "Uppercase : " + str.toUpperCase();

            case "LOWER":
                return "Lowercase : " + str.toLowerCase();

            case "REVERSE":
                return "Reverse : " +
                        new StringBuilder(str).reverse().toString();

            case "PALINDROME":

                String reversed =
                        new StringBuilder(str).reverse().toString();

                if (str.equalsIgnoreCase(reversed)) {
                    return str + " is a Palindrome";
                }

                return str + " is not a Palindrome";

            case "VOWELS":

                int count = 0;

                for (int i = 0; i < str.length(); i++) {

                    char ch = Character.toLowerCase(str.charAt(i));

                    if (ch == 'a' || ch == 'e' ||
                        ch == 'i' || ch == 'o' ||
                        ch == 'u') {
                        count++;
                    }
                }

                return "Number of vowels : " + count;

            default:
                return "Invalid command. Supported commands: "
                        + "LENGTH, UPPER, LOWER, REVERSE, "
                        + "PALINDROME, VOWELS";
        }
    }
}