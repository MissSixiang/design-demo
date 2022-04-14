package adapter;

/**
 * @description 待适配类，无法正常的符合Target接入标准的类
 * @author: yianmou
 **/
public class Adaptee {
    public void prepare1() {
        System.out.println("Adaptee prepare1()");
    }
    public void prepare2() {
        System.out.println("Adaptee prepare2()");
    }
    public void prepare3() {
        System.out.println("Adaptee prepare3()");
    }
    public void doingSomething() {
        System.out.println("Adaptee doingSomething()");
    }
}
