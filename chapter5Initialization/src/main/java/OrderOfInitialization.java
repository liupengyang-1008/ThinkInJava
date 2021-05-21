

class Window {
    Window(int maker) {
        System.out.println("Window(" + maker + ")");
    }
}

class House {
    Window w1 = new Window(1) ; // before constructor
    House() {
        // show that we are in the constructor
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2); //After constructor
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3); // end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // constructor is done
    }
}
