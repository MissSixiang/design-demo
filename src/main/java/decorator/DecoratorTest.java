package decorator;

/**
 * @description
 * @author: yianmou
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        // 创建深焙咖啡
        Beverage darkRoast = new DarkRoast();
        // 创建摩卡，加入到咖啡中
        Beverage mocha = new Mocha(darkRoast);
        // 创建奶泡，加入到咖啡中
        Beverage whip = new Whip(mocha);
        System.out.println("总金额为：" + whip.cost());
    }
}
