package chapter9.inter.face;

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implement1 implements Service {

    @Override
    public void method1() {
        System.out.println("Implement1 m1");
    }

    @Override
    public void method2() {
        System.out.println("Implement1 m2");
    }
}

class Implement1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implement1();
    }
}

class Implement2 implements Service {

    @Override
    public void method1() {
        System.out.println("Implement2 m1");
    }

    @Override
    public void method2() {
        System.out.println("Implement2 m2");
    }
}

class Implement2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implement2();
    }
}


public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implement1Factory());
        serviceConsumer(new Implement2Factory());
    }
}
