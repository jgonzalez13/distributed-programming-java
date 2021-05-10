package mx.ucol.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiverMessage implements Runnable{
    private Socket socket;

    public ReceiverMessage(Socket socket) {
        this.socket = socket;
    }

    public void run () {
        try {
            DataInputStream dataInputStream;
            String inputData;

            do {
                dataInputStream = new DataInputStream(this.socket.getInputStream());
                inputData = (String) dataInputStream.readUTF();

                System.out.println("Received message: " + inputData);
            } while (socket.isConnected());
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}