// 继承语法
class Cleaner {
    private String s = "Cleaner" ;
    public void append(String a) {s += a;}
    public void dilute() {append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub() {append(" scrub()");}
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute();x.apply();x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleaner {
    public void scrub() {
        append(" Detergent.scrub ");
        super.scrub(); // call base version
    }
    //add method to the interface
    public void foam() {append(" foam()");}

    //Test new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("test base class");
        Cleaner.main(args);
    }
}

//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=51661:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter7Reusing\target\classes" Detergent
//        Cleaner dilute() apply() Detergent.scrub  scrub() foam()
//        test base class
//        Cleaner dilute() apply() scrub()
//
//        Process finished with exit code 0
