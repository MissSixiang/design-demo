package decorator;

/**
 * @description 调料具体实现
 * @author: yianmou
 **/
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Mocha";
    }

    public double cost() {
        System.out.println("Mocha case：" + 0.99);
        return 0.99 + beverage.cost();
    }
}
