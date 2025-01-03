import java.io.*;
import java.net.*;

class ServerSocketExample {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 1212
            ServerSocket serverSocket = new ServerSocket(1212);
            System.out.println("Server is waiting for a client...");

            // Accept a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create a DataInputStream to read data from the client
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            // Read the UTF string sent by the client
            String message = dataInputStream.readUTF();
            System.out.println("Message from client: " + message);

            // Close the resources
            dataInputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}