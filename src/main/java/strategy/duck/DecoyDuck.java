package strategy.duck;


import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

/**
 * @description 诱饵鸭
 * @author: yianmou
 **/
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay(); // 不会飞
        quackBehaviorBehavior = new MuteQuack(); // 哑巴鸭，不会叫
    }

    public void display() {
        System.out.println("诱饵鸭的外貌特征");
    }
}
