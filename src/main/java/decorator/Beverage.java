package decorator;

/**
 * @description 饮品抽象类
 * @author: yianmou
 **/
public abstract class Beverage {

    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
