package iterator;

import java.util.ArrayList;

/**
 * @description A餐厅的菜单（采用ArrayList存储）
 * @author: yianmou
 **/
public class ARestaurantMenu implements Menu {

    private ArrayList<MenuItem> menuItems;

    public ARestaurantMenu() {
        menuItems = new ArrayList<>();
        addItem("油条", "油条的描述", true, 0.5);
        addItem("豆浆", "豆浆的描述", true, 1.9);
        addItem("茶叶蛋", "茶叶蛋的描述", true, 1.5);
        addItem("小笼包", "小笼包的描述", true, 2.1);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public MenuIterator iterator() {
        return new ARestaurantMenuIterator(menuItems);
    }
}
