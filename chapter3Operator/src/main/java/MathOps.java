import java.util.Random;


public class MathOps {
    public static void main(String[] args) {
        // creata radom number generator
        Random rand = new Random(47);
        int i, j, k;

        j = rand.nextInt(100) + 1;
        System.out.println("j :" + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k :" + k);
        i = j + k;
        System.out.println("j + k :" + i);
        i = j - k;
        System.out.println("j - k :" + i);
        i = j / k;
        System.out.println("j / k :" + i);
        i = j * k;
        System.out.println("j * k :" + i);
        i = j % k;
        System.out.println("j % k :" + i);

        // float
        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        System.out.println("v,w:" + v + ' ' + w);
        u = v + w;
        System.out.println("v + w :" + u);
        u = v - w;
        System.out.println("v - w :" + u);
        u = v * w;
        System.out.println("v * w :" + u);
        u = v / w;
        System.out.println("v / w :" + u);

    }
}
