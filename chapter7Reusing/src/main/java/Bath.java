

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed" ;
    }
}

public class Bath {
    private String
            s1 = "happy",
            s2 = "happy",
            s3,s4;
    private Soap castille ;
    private int i ;
    private float t ;
    private float toy ;
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    //instance initialize
    {i = 47;}
    public String toString(){
        if (s4 == null)
            s4 = "Joy";
        return  "s1 = " + s1 + " " +
                "s2 = " + s2 + " " +
                "s3 = " + s3 + " " +
                "s4 = " + s4 + "\n" +
                "i = " + i + " " + "\n" +
                "toy = " + toy + " " +
                "castille = " + castille;

    }

    public static void main(String[] args) {
        Bath b = new Bath() ;
        System.out.println(b);
    }
}


//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=51070:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter7Reusing\target\classes" Bath
//        Inside Bath()
//        Soap()
//        s1 = happy s2 = happy s3 = Joy s4 = Joy
//        i = 47
//        toy = 3.14 castille = Soap@1b6d3586
//
//        Process finished with exit code 0
