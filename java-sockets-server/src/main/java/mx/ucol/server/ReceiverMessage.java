package mx.ucol.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiverMessage implements Runnable{
    private Socket socket;

    public ReceiverMessage (Socket socket) {
        this.socket = socket;
    }

    public void run () {
        try {
            DataInputStream dataInputStream;
            String data;

            do {
                dataInputStream = new DataInputStream(socket.getInputStream());
                data = (String) dataInputStream.readUTF();

                System.out.println("MESSAGE: " + data);
            } while (socket.isConnected());
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}