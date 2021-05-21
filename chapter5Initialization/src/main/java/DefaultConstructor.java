public class DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird() ; //default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
        // Bird2 b = new Bird2() ;  //会报错
    }
}

class Bird {

}

class Bird2 {
    Bird2(int i) {}
    Bird2(double d){    }
}