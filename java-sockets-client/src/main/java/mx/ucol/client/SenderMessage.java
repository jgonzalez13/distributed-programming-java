package mx.ucol.client;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SenderMessage implements Runnable{
    private Socket socket;

    public SenderMessage (Socket socket) {
        this.socket = socket;
    }

    public void run () {
        try {
            DataOutputStream dataOutputStream;
            String message;

            do {
                Scanner sc = new Scanner(System.in);
                message = sc.nextLine();
                dataOutputStream = new DataOutputStream(this.socket.getOutputStream());

                dataOutputStream.writeUTF(message);
                dataOutputStream.flush();
            } while (!message.equals("/c"));

            System.out.println("See you Later abubu");
            dataOutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}