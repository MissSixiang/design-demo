package iterator;

/**
 * @description 迭代器模式测试类
 * @author: yianmou
 **/
public class IteratorTest {
    public static void main(String[] args) {
        /** 构建A餐馆和B餐馆的菜单 */
        ARestaurantMenu aMenu = new ARestaurantMenu();
        BRestaurantMenu bMenu = new BRestaurantMenu();
        /** 构建女服务员 */
        Waitress waitress = new Waitress();
        /** 将A餐馆和B餐馆的菜单传给服务员，让她报出菜单来 */
        waitress.printMenu(aMenu, bMenu);
    }
}
