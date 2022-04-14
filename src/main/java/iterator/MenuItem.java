package iterator;

/**
 * @description 菜单项
 * @author: yianmou
 **/
public class MenuItem {
    // 菜名
    private String name;
    // 菜品详细介绍
    private String desc;
    // 是否是素食
    private boolean vegetarian;
    // 菜的价格
    private double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
