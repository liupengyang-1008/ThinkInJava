// final class 不允许自己或别人继承
class SmallBrain {

}

final  class Dinosaur {
    int i = 7 ;
    int j = 1;
    SmallBrain x =new SmallBrain();
    void f() {}
}
//class Further extends Dinosaur {}


public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n  = new Dinosaur();
        n.f();
        n.i = 34;
        n.j++ ;
    }
}
