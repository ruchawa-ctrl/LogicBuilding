import java.io.*;
import java.net.*;

public class MathServer {

    static final int PORT = 5000;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            System.out.println("Math Server started...");
            System.out.println("Waiting for clients...");

            while (true) {
                Socket socket = serverSocket.accept();

                System.out.println("Client connected: "
                        + socket.getInetAddress());

                ClientHandler client = new ClientHandler(socket);
                client.start();
            }

        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}


class ClientHandler extends Thread {

    private Socket socket;

    ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            out.println("Connected to Mathematical Server.");
            out.println("Enter command or QUIT to exit.");

            String command;

            while ((command = in.readLine()) != null) {

                command = command.trim();

                if (command.equalsIgnoreCase("QUIT")) {
                    out.println("Disconnected from server.");
                    break;
                }

                String result = processCommand(command);
                out.println(result);
            }

            socket.close();

            System.out.println("Client disconnected.");

        } catch (IOException e) {
            System.out.println("Client connection error: "
                    + e.getMessage());
        }
    }


    private String processCommand(String command) {

        String[] parts = command.split("\\s+");

        if (parts.length != 3) {
            return "Invalid command. Format: OPERATION <No1> <No2>";
        }

        String operation = parts[0].toUpperCase();

        long num1;
        long num2;

        try {
            num1 = Long.parseLong(parts[1]);
            num2 = Long.parseLong(parts[2]);
        } catch (NumberFormatException e) {
            return "Invalid numbers. Please enter valid integers.";
        }


        switch (operation) {

            case "ADD":
                return "Result is : " + (num1 + num2);

            case "SUB":
                return "Result is : " + (num1 - num2);

            case "MULT":
                return "Result is : " + (num1 * num2);

            case "DIV":

                if (num2 == 0) {
                    return "Error: Division by zero is not allowed.";
                }

                return "Result is : " + (num1 / num2);

            case "MOD":

                if (num2 == 0) {
                    return "Error: Modulo by zero is not allowed.";
                }

                return "Result is : " + (num1 % num2);

            case "MAX":
                return "Maximum number is : "
                        + Math.max(num1, num2);

            case "MIN":
                return "Minimum number is : "
                        + Math.min(num1, num2);

            default:
                return "Invalid operation. Supported operations: "
                        + "ADD, SUB, MULT, DIV, MOD, MAX, MIN, QUIT";
        }
    }
}