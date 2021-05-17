public class WhileTest {
    static boolean condition() {
        double result = Math.random()  ;
        System.out.print(result + ",");
        return result < 0.99;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while' ");
        System.out.println("Exited 'while' ");
    }
}
