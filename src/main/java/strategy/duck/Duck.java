package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehaviorBehavior;

/**
 * @description
 * @author: yianmou
 **/
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehaviorBehavior quackBehaviorBehavior;

    public abstract void display();

    public void swin() {
        System.out.println("鸭子游泳");
    }

    public void performQuack() {
        quackBehaviorBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehaviorBehavior(QuackBehaviorBehavior quackBehaviorBehavior) {
        this.quackBehaviorBehavior = quackBehaviorBehavior;
    }
}
