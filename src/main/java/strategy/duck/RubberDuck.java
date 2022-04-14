package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Squeak;

/**
 * @description 橡皮鸭
 * @author: yianmou
 **/
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay(); // 不会飞
        quackBehaviorBehavior = new Squeak(); // 橡皮鸭的吱吱叫
    }

    public void display() {
        System.out.println("橡皮鸭的外貌特征");
    }
}
