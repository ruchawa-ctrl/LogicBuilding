import java.io.*;
import java.net.*;
import java.util.Scanner;

public class NumberClient {

    static final String SERVER = "localhost";
    static final int PORT = 6000;

    public static void main(String[] args) {

        try {
            Socket socket = new Socket(SERVER, PORT);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            System.out.println(in.readLine());

            while (true) {

                System.out.print("\nEnter command : ");
                String command = sc.nextLine();

                out.println(command);

                String response = in.readLine();

                System.out.println("Server: " + response);

                if (command.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

            socket.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Connection Error: "
                    + e.getMessage());
        }
    }
}