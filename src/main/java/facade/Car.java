package facade;

/**
 * @description
 * @author: yianmou
 **/
public class Car {
    private Engine engine;
    private Door door;
    private DashboardDisplay display;
    private Key key;

    public Car() {
        engine = new Engine();
        door = new Door();
        display = new DashboardDisplay();
        key = new Key();
    }

    /** 汽车启动 */
    public void start() {
        if (key.turns()) {
            door.lock();
            engine.start();
            display.refreshDisplay();
        }
    }
}
