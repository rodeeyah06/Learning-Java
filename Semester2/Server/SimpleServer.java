package Semester2.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);

        System.out.println("Server is waiting for incoming connection");

        Socket socket = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


        String message = in.readLine();
        System.out.println("Recieved" + message);
        out.print("Hello Server");

        in.close();
        out.close();
        socket.close();
        server.close();
    }
}
