package Assignments.A67;

import java.io.*;
import java.net.*;

public class FileExistenceServer {

    public static void main(String[] args) {

        int port = 5000;
        String serverDirectory = "ServerData";

        try {
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            String request = in.readLine();

            if (request != null && request.startsWith("EXISTS ")) {

                String fileName = request.substring(7).trim();

                File file = new File(serverDirectory, fileName);

                if (file.exists() && file.isFile()) {
                    out.println(fileName + " exists on server");
                }
                else {
                    out.println(fileName + " does not exist");
                }
            }
            else {
                out.println("Invalid command");
            }

            socket.close();
            serverSocket.close();

        }
        catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}