// 结合使用组合和继承



class Plate {
    Plate(int i) {
        System.out.println("Plate constructor"+i);
    }
}


class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor"+i);
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil constructor"+i);
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor"+i);
    }
}

class Fork extends Utensil {

    Fork(int i) {
        super(i);
        System.out.println("Fork constructor"+i);
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
        System.out.println("Knife constructor"+i);
    }
}


// a cultural of doing smt
class Custon {
    Custon(int i) {
        System.out.println("Custon constructor"+i);
    }
}


public class PlaceSetting extends Custon {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl ;
    PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i +2 );
        frk = new Fork(i +3);
        kn = new Knife(i+4);
        pl= new DinnerPlate(i+5);


        System.out.println("PlaceSetting constructor"+i);
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }

}

//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=57662:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter7Reusing\target\classes" PlaceSetting
//        Custon constructor10
//        Utensil constructor11
//        Spoon constructor11
//        Utensil constructor12
//        Fork constructor12
//        Utensil constructor13
//        Knife constructor13
//        Plate constructor14
//        DinnerPlate constructor14
//        PlaceSetting constructor9
//
//        Process finished with exit code 0

