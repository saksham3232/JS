import java.io.*;
import java.net.*;

class ClientExample {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 1212
            Socket socket = new Socket("localhost", 1212);
            System.out.println("Connected to the server.");

            // Create a DataOutputStream to send data to the server
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // Write a message to the server
            String message = "Hello from the client!";
            dataOutputStream.writeUTF(message);
            System.out.println("Message sent to the server: " + message);

            // Close the output stream and the socket
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}