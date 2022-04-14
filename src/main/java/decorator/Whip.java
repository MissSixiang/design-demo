package decorator;

/**
 * @description 调料具体实现
 * @author: yianmou
 **/
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Whip";
    }

    public double cost() {
        System.out.println("Whip case：" + 0.5);
        return 0.5 + beverage.cost();
    }

}
