package chapter9.inter.face;

public interface Instrument {
    int VALUE = 5;
    void play(String a);
    void adjust();

}

class Wind implements Instrument {

    @Override
    public void play(String a) {
        System.out.println("a");
    }

    @Override
    public void adjust() {
        System.out.println("Wind adjust");
    }
}