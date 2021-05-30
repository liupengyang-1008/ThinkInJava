// final 数据
import jdk.nashorn.internal.codegen.CompilerConstants;

import javax.xml.stream.FactoryConfigurationError;
import java.util.* ;

class Value {
    int i ;
    public Value(int i ){ this.i = i ;}
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id ;
    public FinalData(String id) {
        this.id = id ;
    }

    // can be compile-time constants
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    //Typical public constant
    public static final int VALUE_THREE = 40;

    //Cannot compile-time constants
    private final int i4 = rand.nextInt(22);
    static final  int INT_5 = rand.nextInt(22);
    private Value v1 = new Value(11);
    private static final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    //Arrays
    private final int[] a = {1,2,3,4,5,6};
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1") ;
//        fd1.valueOne++
        fd1.v2.i++ ;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }

//        fd1.v2 = new Value(0);
//        fd1.VAL_3 = new Value(1) ;
//        fd1.a = new int[3];

        System.out.println(fd1);
        System.out.println("Creating new Final Data");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);

    }

}

//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=54824:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter7Reusing\target\classes;C:\Users\Liupy\.m2\repository\org\jetbrains\annotations\21.0.1\annotations-21.0.1.jar" FinalData
//        fd1: i4 = 1, INT_5 = 8
//        Creating new Final Data
//        fd1: i4 = 1, INT_5 = 8
//        fd2: i4 = 9, INT_5 = 8
//
//        Process finished with exit code 0