package Assignments.A65;

import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.*;
import java.net.InetAddress;

public class InfoServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6000);

            System.out.println("Server started...");
            System.out.println("Waiting for clients...");

            while (true) {

                Socket socket = serverSocket.accept();

                System.out.println("Client connected.");

                ClientHandler client =
                        new ClientHandler(socket);

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

    public void run() {

        try {

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            String command;

            while ((command = in.readLine()) != null) {

                command = command.trim().toUpperCase();

                switch (command) {

                    case "DATE":

                        String date = LocalDate.now().format(
                                DateTimeFormatter.ofPattern(
                                        "dd-MM-yyyy"));

                        out.println(date);
                        break;


                    case "TIME":

                        String time = LocalTime.now().format(
                                DateTimeFormatter.ofPattern(
                                        "HH:mm:ss"));

                        out.println(time);
                        break;


                    case "SERVERNAME":

                        String serverName =
                                InetAddress.getLocalHost()
                                        .getHostName();

                        out.println(serverName);
                        break;


                    case "HELP":

                        out.println(
                                "Available Commands:\n" +
                                "DATE\n" +
                                "TIME\n" +
                                "SERVERNAME\n" +
                                "HELP\n" +
                                "QUIT"
                        );

                        break;


                    case "QUIT":

                        out.println(
                                "Connection terminated."
                        );

                        socket.close();
                        return;


                    default:

                        out.println(
                                "Invalid command. Type HELP "
                                + "to see available commands."
                        );
                }
            }

            socket.close();

        } catch (IOException e) {

            System.out.println(
                    "Client Error: " + e.getMessage()
            );
        }
    }
}