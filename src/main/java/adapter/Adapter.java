package adapter;

/**
 * @description 适配器
 * @author: yianmou
 **/
public class Adapter implements Target {
    // 待适配的类
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void prepare() {
        adaptee.prepare1();
        adaptee.prepare2();
        adaptee.prepare3();
    }

    public void execute() {
        adaptee.doingSomething();
    }
}
