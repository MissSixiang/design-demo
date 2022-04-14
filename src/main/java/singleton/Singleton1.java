package singleton;

/**
 * @description 饿汉式(线程安全，调用效率高，但是不能延时加载)
 * @author: yianmou
 **/
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return instance;
    }
}