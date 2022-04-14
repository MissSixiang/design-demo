package singleton;

/**
 * @description 静态内部类（线程安全，调用效率高，可以延时加载）
 * @author: yianmou
 **/
public class Singleton4 {
    /**
     * 静态内部类
     **/
    private static class SingletonClassInstance{
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4(){}

    public static Singleton4 getInstance(){
        return SingletonClassInstance.instance;
    }
}
