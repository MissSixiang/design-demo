package strategy;


import strategy.duck.Duck;
import strategy.duck.RubberDuck;
import strategy.fly.FlyWithWings;

/**
 * @description
 * @author: yianmou
 **/
public class StrategyTest {
    public static void main(String[] args) {
        // 生成橡皮鸭
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        System.out.println("-----------对橡皮鸭进行改造，让它能飞起来------------");
        rubberDuck.setFlyBehavior(new FlyWithWings()); // 更换会飞的算法族
        rubberDuck.performFly();
    }
}
