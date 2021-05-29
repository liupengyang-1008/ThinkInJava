// 确保正确清理

// 清理放入到finally
class Shape {
    Shape(int i) {
        System.out.println("Shape constructor"+i);
    }
    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i ) {
        super(i);
        System.out.println("Circle constructor"+i);
    }
    void dispose() {
        System.out.println("Circle dispose");
        super.dispose();
    }
}


class Triangle extends Shape {
    Triangle(int i ) {
        super(i);
        System.out.println("Triangle constructor"+i);
    }
    void dispose() {
        System.out.println("Triangle dispose");
        super.dispose();
    }
}

class Line extends Shape {
    private int start,end;
    Line(int start,int end) {
        super(start);
        this.start = start;
        this.end = end ;
        System.out.println("Draw line :"+start+", "+end);
    }

    void dispose() {
        System.out.println("Erasing line:"+start+", "+ end);
        super.dispose();
    }
}

public class CADSystem extends  Shape {
    private Circle c;
    private Triangle  t;
    private Line[] lines = new Line[3];
    CADSystem(int i) {
        super(i+1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j,j*j);
        }
        c = new Circle(1);
        t = new Triangle(1) ;
        System.out.println("CADSystem constructor");

    }

    public void dispose() {
        System.out.println("CADSystem dispose");

        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i>=0;i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            //
        } finally {
            x.dispose();
        }
    }
}
//"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" -javaagent:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\lib\idea_rt.jar=57986:D:\ProgramData\JetBrains\Toolbox\apps\IDEA-C\ch-0\211.7142.45\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\JavaProjects\ThinkInJava\chapter7Reusing\target\classes" CADSystem
//        Shape constructor48
//        Shape constructor0
//        Draw line :0, 0
//        Shape constructor1
//        Draw line :1, 1
//        Shape constructor2
//        Draw line :2, 4
//        Shape constructor1
//        Circle constructor1
//        Shape constructor1
//        Triangle constructor1
//        CADSystem constructor
//        CADSystem dispose
//        Triangle dispose
//        Shape dispose
//        Circle dispose
//        Shape dispose
//        Erasing line:2, 4
//        Shape dispose
//        Erasing line:1, 1
//        Shape dispose
//        Erasing line:0, 0
//        Shape dispose
//        Shape dispose
//
//        Process finished with exit code 0
