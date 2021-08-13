package org.example;

import org.junit.jupiter.api.Test;

/**
 * Created by rishi on 14/08/2021
 */
public class WriteCombiningTest {

    @Test
    void testBitShift() {
        final int ITEMS = 1 << 24;
        final int MASK = ITEMS - 1;

        System.out.println(Integer.toBinaryString(ITEMS));
        System.out.println(Integer.toBinaryString(MASK));

        System.out.println(ITEMS);
        System.out.println(MASK);

        int i = Integer.MAX_VALUE-1;
        int slot = i & MASK;
        byte b = (byte) i;

        System.out.println(Integer.toBinaryString(i+1));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(slot));
        System.out.println(Integer.toBinaryString(b));

        System.out.println(i);
        System.out.println(slot);
        System.out.println(b);
    }
}
