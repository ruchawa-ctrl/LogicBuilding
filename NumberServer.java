import java.io.*;
import java.net.*;

public class NumberServer {

    static final int PORT = 6000;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            System.out.println("Number Server started...");
            System.out.println("Waiting for clients...");

            while (true) {

                Socket socket = serverSocket.accept();

                System.out.println("Client connected: "
                        + socket.getInetAddress());

                NumberClientHandler client =
                        new NumberClientHandler(socket);

                client.start();
            }

        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}


class NumberClientHandler extends Thread {

    private Socket socket;

    NumberClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            out.println("Connected to Number Operation Server.");

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
            System.out.println("Client error: "
                    + e.getMessage());
        }
    }


    private String processCommand(String command) {

        String[] parts = command.split("\\s+");

        if (parts.length != 2) {
            return "Invalid command. Format: OPERATION <number>";
        }

        String operation = parts[0].toUpperCase();

        long number;

        try {
            number = Long.parseLong(parts[1]);
        } catch (NumberFormatException e) {
            return "Invalid number. Please enter an integer.";
        }


        switch (operation) {

            case "EVEN":
                return isEven(number)
                        ? number + " is Even"
                        : number + " is not Even";

            case "ODD":
                return isOdd(number)
                        ? number + " is Odd"
                        : number + " is not Odd";

            case "PRIME":
                return isPrime(number)
                        ? number + " is a Prime Number"
                        : number + " is not a Prime Number";

            case "PERFECT":
                return isPerfect(number)
                        ? number + " is a Perfect Number"
                        : number + " is not a Perfect Number";

            case "FACTORIAL":

                if (number < 0) {
                    return "Factorial is not defined for negative numbers.";
                }

                if (number > 20) {
                    return "Number too large. Enter a number from 0 to 20.";
                }

                return "Factorial is : " + factorial(number);

            case "REVERSE":
                return "Reverse is : " + reverse(number);

            default:
                return "Invalid operation. Supported operations: "
                        + "EVEN, ODD, PRIME, PERFECT, FACTORIAL, REVERSE";
        }
    }


    // Method to check even number
    private boolean isEven(long number) {
        return number % 2 == 0;
    }


    // Method to check odd number
    private boolean isOdd(long number) {
        return number % 2 != 0;
    }


    // Method to check prime number
    private boolean isPrime(long number) {

        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (long i = 3; i <= number / i; i += 2) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    // Method to check perfect number
    private boolean isPerfect(long number) {

        if (number <= 1) {
            return false;
        }

        long iSum = 1;

        for (long i = 2; i <= number / i; i++) {

            if (number % i == 0) {

                iSum += i;

                if (i != number / i) {
                    iSum += number / i;
                }
            }
        }

        return iSum == number;
    }


    // Method to calculate factorial
    private long factorial(long number) {

        long iResult = 1;

        for (long i = 2; i <= number; i++) {
            iResult *= i;
        }

        return iResult;
    }


    // Method to reverse a number
    private long reverse(long number) {

        boolean negative = number < 0;

        number = Math.abs(number);

        long reversed = 0;

        while (number != 0) {

            long digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return negative ? -reversed : reversed;
    }
}