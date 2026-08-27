package Assignments.A67;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileExistenceClient {

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

            out.println("EXISTS " + fileName);

            String response = in.readLine();

            System.out.println("\nServer:");
            System.out.println(response);

            socket.close();

        }
        catch (IOException e) {
            System.out.println("Unable to connect to server.");
        }

        sc.close();
    }
}