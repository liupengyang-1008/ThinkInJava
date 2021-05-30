// final 参数 你可以读参数 不能修改
class Gizmo {
    public void spin() {}
}
public class FinalAgruments {
    void with(final Gizmo g) {
//        g = new Gizmo();// g 是final 的 不合法
    }

    void without(Gizmo g) {
        g=new Gizmo();
        g.spin();
    }
    int g(final int i ) {return i + 1;}

    public static void main(String[] args) {
        FinalAgruments bf = new FinalAgruments();
        bf.without(null);
        bf.with(null);
    }

}
