package Assignments.A67;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileInfoClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Client: ");

        String fileName = sc.nextLine();

        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            out.println("INFO " + fileName);

            System.out.println("\nServer:");

            String response;

            while ((response = in.readLine()) != null) {

                if (response.equals("END")) {
                    break;
                }

                System.out.println(response);
            }

            socket.close();

        }
        catch (IOException e) {
            System.out.println("Unable to connect to server.");
        }

        sc.close();
    }
}
