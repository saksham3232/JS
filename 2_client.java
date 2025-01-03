import java.io.*;
import java.net.*;

class ClientExample {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 1212
            Socket socket = new Socket("localhost", 1212);
            System.out.println("Connected to the server.");

            // Create input and output streams
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            // Send a message to the server
            String message = "Hello from the client!";
            dataOutputStream.writeUTF(message);
            System.out.println("Message sent to the server: " + message);

            // Read the server's response
            String serverResponse = dataInputStream.readUTF();
            System.out.println("Message from server: " + serverResponse);

            // Close resources
            dataOutputStream.close();
            dataInputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}