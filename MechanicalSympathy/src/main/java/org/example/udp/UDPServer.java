package org.example.udp;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by rishi on 19/08/2021
 */
public class UDPServer {

    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(5000);
        } catch (SocketException se) {
            System.out.println("Socket Exception: " + se.getMessage());
        }
    }

}
