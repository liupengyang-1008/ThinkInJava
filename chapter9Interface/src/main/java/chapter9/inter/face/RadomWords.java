package chapter9.inter.face;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RadomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "QWERTYUIOPADDFGSHJKLXCVBNM".toCharArray();
    private int count;
    public RadomWords(int c) {count = c;}
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- ==0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        cb.append(capitals[rand.nextInt(capitals.length)]);
        cb.append(capitals[rand.nextInt(capitals.length)]);
        cb.append(capitals[rand.nextInt(capitals.length)]);
        cb.append("");

        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RadomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
