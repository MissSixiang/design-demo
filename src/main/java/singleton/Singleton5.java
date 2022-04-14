package singleton;

/**
 * @description 枚举
 * @author: yianmou
 **/
public enum Singleton5 {
    //枚举元素本身就是单例
    INSTANCE;

    //添加自己需要的操作，直接通过SingletonDemo5.INSTANCE.doSomething()的方式调用即可。方便、简洁又安全。
    public void doSomething() {
        System.out.println("doSomething");
    }
}
