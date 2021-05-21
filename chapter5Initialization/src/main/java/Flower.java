// 在构造器中使用构造器
// 构造器必须在开头
// 构造器中可以再调用一次构造器
// 其他方法中不允许调用构造器
// static 方法就是没有this 的方法
// static 方法不能调用非静态方法
// static 相当于全局方法，可以再static中调用其他类的static方法
public class Flower {
    int petalCount = 0 ;
    String s = "initialize value" ;
    Flower(int petals) {
        petalCount = petals ;
        System.out.println("Constuctor w/ int arg only ,petal count = " + petalCount);
    }
    Flower(String ss) {
        System.out.println("Constuctor w/ String arg only ,s = " + ss);
        s = ss ;
    }
    Flower(String s,int petals) {
        this(petals) ;
        // this(s) ; // 不能调用2次this
        this.s = s ;
        System.out.println("String & int args");
    }
    Flower() {
        this("hi ,47") ;
        System.out.println(" default constructor (no args ) ");

    }

    void printPetalCount() {
        // this(11)  ; not in the constructor
        System.out.println("Petal Count =  " + petalCount + " s =" + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }



}
