package singleton;

/**
 * @description 双重校验
 * @author: muse
 **/
public class Singleton3 {
    private volatile static Singleton3 singletonDemo3;

    private Singleton3() {
    }

    public static Singleton3 newInstance() {
        if (singletonDemo3 == null) {
            synchronized (Singleton3.class) {
                if (singletonDemo3 == null) {
                    singletonDemo3 = new Singleton3();
                }
            }
        }
        return singletonDemo3;
    }
}
