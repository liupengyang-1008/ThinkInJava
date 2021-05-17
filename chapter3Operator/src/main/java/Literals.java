public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f ;
        System.out.println("i1 : " + Integer.toBinaryString(i1));
        int i2 = 0x2F ;
        System.out.println("i2 : " + Integer.toBinaryString(i2));
        int i3 = 0177 ;
        System.out.println("i3 : " + Integer.toBinaryString(i3));

        char c = 0xffff ;
        System.out.println("c : " + Integer.toBinaryString(c));
        char b = 0x7f ;
        System.out.println("b : " + Integer.toBinaryString(b));

        char s = 0x7fff ;
        System.out.println("s : " + Integer.toBinaryString(s));


        float f1 = 1 ;
        float f2 = 1L ;
        float f3 = 1f ;
        double d1 = 1d ;
        double d2 = 1D ;
        System.out.println(f1 + ' ' + f2+ ' ' + f3 + ' ' +d1+ ' ' +d2);









    }
}
