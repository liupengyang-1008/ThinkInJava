public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    // name of constructor is same as class name 构造器
    Rock() { // this is the constructor
        System.out.println("Rock");
    }
}