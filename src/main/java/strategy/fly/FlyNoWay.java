package strategy.fly;

/**
 * @description 不会飞行
 * @author: yianmou
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
