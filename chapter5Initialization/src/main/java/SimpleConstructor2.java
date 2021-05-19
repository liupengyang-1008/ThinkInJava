public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8 ; i++) {
            new Rock2(i) ;
        }
    }
}
class Rock2 {
    // name of constructor is same as class name 构造器
    Rock2(int i) { // this is the constructor 可以传参
        System.out.println("Rock " + i + " ");
    }
}