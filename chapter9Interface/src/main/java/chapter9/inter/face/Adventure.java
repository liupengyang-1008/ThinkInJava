package chapter9.inter.face;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("ActionCharacter f");
    }
}

class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class Adventure {
    /*
    接口可以继承
    实现多个接口如果出现方法名重复则会报错
     */
    public static void t(CanFight x) {x.fight();}
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
    }
}
