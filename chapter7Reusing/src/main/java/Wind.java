//向上转型

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        System.out.println(i.getClass() + " play!");
        i.play();
    }
}

public class Wind  extends  Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // 向上转型
    }
}
