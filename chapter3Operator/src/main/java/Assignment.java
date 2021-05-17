
class Tank {
    int level ;
}

class Ftank {
    double score ;
}

public class Assignment {

    public static void main(String[] args) {
        Tank t1 =new Tank();
        Tank t2 =new Tank();
        t1.level = 9 ;
        t2.level = 49 ;
        System.out.println("t1.level:" + t1.level + " t2.levle:" + t2.level);;
        t1=t2; // 赋值操作是对一个对象的引用
//        t1.level = t2.level   // 避免绑定
        System.out.println("t1.level:" + t1.level + " t2.levle:" + t2.level);;
        t1.level =27;
        // 修改t1 的时候同时修改了t2
        System.out.println("t1.level:" + t1.level + " t2.levle:" + t2.level);

        t2.level =272;
        // 修改t1 的时候同时修改了t2
        System.out.println("t1.level:" + t1.level + " t2.levle:" + t2.level);;

        Ftank s1 =new Ftank();
        Ftank s2 =new Ftank();
        s1.score = 123.3;
        s2.score = 34.123;
        System.out.println("s1.score:" + s1.score + " s2.score:" + s2.score);;
        s1.score = s2.score;
        System.out.println("s1.score:" + s1.score + " s2.score:" + s2.score);;
        s1.score =27.33;
        System.out.println("s1.score:" + s1.score + " s2.score:" + s2.score);;


    }
}
