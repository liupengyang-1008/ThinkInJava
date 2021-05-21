public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana() ;
        Banana b = new Banana() ;

        a.peel(1);
        b.peel(2);
    }
}

class Banana {
    void peel(int i) {};
    void pick() {} ;
    void pit() {pick();} ; // 调用内部方法
}