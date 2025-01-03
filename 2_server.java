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

            // Create input and output streams
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // Read the client's message
            String clientMessage = dataInputStream.readUTF();
            System.out.println("Message from client: " + clientMessage);

            // Send a response to the client
            String response = "Hello from the server!";
            dataOutputStream.writeUTF(response);
            System.out.println("Response sent to the client.");

            // Close resources
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
