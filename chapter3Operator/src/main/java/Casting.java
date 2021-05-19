public class Casting {
    //类型转换
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;
        i = (int) lng2;


        // 截尾 和舍入
        // 小数转换整数
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)ablove : " + (int) above);
        System.out.println("(int)below : " + (int) below);
        System.out.println("(int)fablove : " + (int) fabove);
        System.out.println("(int)fbelow : " + (int) fbelow);

        System.out.println("math.rountd(ablove) : " + Math.round(above));
        System.out.println("math.rountd(below) : " + Math.round(below));
        System.out.println("math.rountd(fablove) : " + Math.round(fabove));
        System.out.println("math.rountd(fbelow) : " + Math.round(fbelow));
    }
}
