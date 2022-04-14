package observer;

/**
 * @description
 * @author: yianmou
 **/
public class OberverTest {
    public static void main(String[] args) {
        Observer cObserver1 = new ConcreteObserver1();
        Observer cObserver2 = new ConcreteObserver2();
        Observer cObserver3 = new ConcreteObserver3();
        /** 创建主题 */
        ConcreteSubject subject = new ConcreteSubject();

        /** 注册三个监听者*/
        subject.registerObserver(cObserver1);
        subject.registerObserver(cObserver2);
        subject.registerObserver(cObserver3);

        /** 发送通知 */
        System.out.println("----------给cObserver1、cObserver2、cObserver3发通知----------");
        subject.notifyObserver();

        /** 移除一个监听者ConcreteObserver2*/
        subject.removeObserver(cObserver2);
        System.out.println("----------给cObserver1、cObserver3发通知----------");
        subject.notifyObserver();
    }
}
