package strategy.quack;

/**
 * @description
 * @author: yianmou
 **/
public class MuteQuack implements QuackBehaviorBehavior {
    public void quack() {
        System.out.println("哑巴鸭，不会叫");
    }
}
