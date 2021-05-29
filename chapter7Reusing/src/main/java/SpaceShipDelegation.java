//代理方式构转太空船
public class SpaceShipDelegation {
    private String name ;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name ;
    }

    // Delegation methods
    public void back(int velocity) {
        controls.back(velocity);
    }
    public void up(int velocity) {
        controls.up(velocity);
    }
    public void down(int velocity) {
        controls.down(velocity);
    }
    public void left(int velocity) {
        controls.left(velocity);
    }
    public void right(int velocity) {
        controls.right(velocity);
    }
    public void forward(int velocity) {
        controls.forward(velocity);
    }
    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA protector");
        protector.forward(100);
    }
}
