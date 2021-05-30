// 在组合和继承之间选择

// xx 是 xx 是继承
// xx 有 xx 是组合
class  Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service(){}
}
class Wheel {
    public void inflate() {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}

}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}

}

public class Car {
    private Engine engine = new Engine();
    private Wheel wheel[] = new Wheel[4];
    public Door left = new Door(),
                right = new Door();
    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate();
        car.engine.service();
    }


}
