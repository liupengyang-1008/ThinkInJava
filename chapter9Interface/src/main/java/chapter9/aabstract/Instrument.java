package chapter9.aabstract;

public abstract class Instrument {
     public abstract void play();
     public String what() {return "Instrument";}
}

class Wind extends Instrument {

    @Override
    public void play() {
        System.out.println("Interface.AbstractClass.chapter9.aabstract.Wind play");
    }
}