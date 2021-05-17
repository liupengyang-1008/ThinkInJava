import java.util.Random;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0 ; c < 128 ; c ++)
            if (Character.isLowerCase(c))
                System.out.println("value : " + (int)c + " char " + c);


        for (int i = 1, j = i + 10 ; i < 5 ; i ++,j = i * 2) {
            System.out.println(" i = " + i + " j = " + j);
        }


        // foreach 语法
        Random rand = new Random(47);
        float f[] = new float[10] ;
        System.out.println("f:" + f);
        for (int i = 0;i < 10 ; i ++) {
            f[i] =rand.nextFloat();
        }

        for( float x :f) {
            System.out.println(x);
        }

        for (char c : "asdncasd ojsoadjj asdjlkjla ".toCharArray()) {
            System.out.println(c);
        }

    }
}
