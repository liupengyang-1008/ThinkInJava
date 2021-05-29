
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BordGame extends Game {

    BordGame(int i) {
        //非默认构造器 必须调用基类的构造器
        super(i);
        System.out.println("BordGame constructor");
    }

}

public class Chess extends BordGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }


    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
