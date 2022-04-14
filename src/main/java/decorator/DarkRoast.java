package decorator;

/**
 * @description 饮品具体实现类
 * @author: yianmou
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        System.out.println("DarkRoast case：" + 1.99);
        return 1.99;
    }
}
