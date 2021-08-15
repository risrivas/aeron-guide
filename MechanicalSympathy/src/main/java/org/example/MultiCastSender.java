package org.example;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;

/**
 * Created by rishi on 15/08/2021
 */
public final class MultiCastSender implements Runnable {

    private static volatile long messageCounter = 0L;
    private static long lastMessageCounter = 0L;
    private static long lastTimestamp = System.currentTimeMillis();

    @Override
    public void run() {

    }

    public static void main(String[] args) throws Exception {
        init(args);
        final NetworkInterface networkInterface = NetworkInterface.getByName(args[0]);
        final int count = Integer.parseInt(args[1]);

        final byte[] buffer = "This is a string with sufficient data to test a packet sending"
                .getBytes(StandardCharsets.US_ASCII);

        final int multiCastPort = 4447;
        final String address = "230.0.0.1";

        final InetAddress interfaceAddress = networkInterface.getInterfaceAddresses().get(0).getAddress();

    }

    private static void init(final String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");

        if (2 != args.length) {
            System.out.println("Usage: java MultiCastSender <interface name> <# messages>");
            System.exit(1);
        }
    }
}
