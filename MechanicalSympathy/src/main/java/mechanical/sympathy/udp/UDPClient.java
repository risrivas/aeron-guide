package mechanical.sympathy.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by rishi on 19/08/2021
 */
public class UDPClient {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            DatagramSocket socket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            String echoString;

            do {
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();

                byte[] buffer = echoString.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
                socket.send(packet);

                byte[] buffer2 = new byte[50];
                packet = new DatagramPacket(buffer2, buffer2.length);
                socket.receive(packet);
                System.out.printf("Text received is: %s%n", new String(buffer2, 0, packet.getLength()));
            } while (!echoString.equals("exit"));

        } catch (IOException e) {
            System.out.printf("IOException: %s%n", e.getMessage());
        }
    }

}
