package util;

import java.util.Random;

public class RandInt {
    private static Random rand = new Random(System.currentTimeMillis());

    public static int nextInt(int n) {
	return rand.nextInt(n);
    }
}
