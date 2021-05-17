public class TernaryIfElse {
    static int tenary(int i) {
        return i < 10 ? i * 100 : i * 10 ;

    }

    static int standardIfElse(int i) {
        if (i < 10 )
            return i * 100;
        else
            return i * 10 ;

    }

    public static void main(String[] args) {
        System.out.println(tenary(9));
        System.out.println(tenary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
