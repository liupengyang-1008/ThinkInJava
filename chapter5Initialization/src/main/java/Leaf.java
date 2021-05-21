import sun.rmi.runtime.NewThreadAction;

public class Leaf {
    int i = 0 ;
    Leaf increment() {  // Leaf 表示返回的数据类型是Leaf
        i ++ ;
        return this ;
    }

    void print() {
        System.out.println("i = " + i) ;
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
