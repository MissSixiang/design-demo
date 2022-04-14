package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

/**
 * @description 红头鸭
 * @author: yianmou
 **/
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings(); // 鸭子飞行
        quackBehaviorBehavior = new Quack(); // 红头鸭的呱呱叫
    }

    public void display() {
        System.out.println("红头鸭的外貌特征");
    }
}
