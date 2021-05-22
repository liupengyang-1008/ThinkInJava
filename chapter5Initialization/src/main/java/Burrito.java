
public class Burrito {
    Spiciness degree ;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        System.out.print(" This Burrito is");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:

            case HOT:
                System.out.println("a litle hot");
                break;
            case MEDIUM:
            case FLAMING:
            default:
                System.out.println("maybe too hot ");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.HOT);
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();

    }

}
//
//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=50896:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter5Initialization\target\classes" Burrito
//        This Burrito isa litle hot
//        This Burrito ismaybe too hot
//        This Burrito isa litle hot
//
//        Process finished with exit code 0
