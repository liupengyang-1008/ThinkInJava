class Person {
    public void eat(Apple apple) {
        System.out.println("eat !");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // remove peel
        return apple ;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this); // this 传入当前对象
    }
}


public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
