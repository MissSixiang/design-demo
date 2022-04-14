package iterator;

/**
 * @description B餐厅的菜单（采用数组存储）
 * @author: yianmou
 **/
public class BRestaurantMenu implements Menu {
    int nums = 0;
    private static final int MAX_SIZE = 5; // 餐厅老板很有个性，只做5道菜
    private MenuItem[] menuItems;

    public BRestaurantMenu() {
        menuItems = new MenuItem[MAX_SIZE];
        addItem("宫保鸡丁", "宫保鸡丁的描述", true, 0.5);
        addItem("北京烤鸭", "北京烤鸭的描述", true, 1.9);
        addItem("黄焖鸡米饭", "黄焖鸡米饭的描述", true, 1.5);
        addItem("啵啵鱼", "啵啵鱼的描述", true, 2.1);
        addItem("兰州拉面", "兰州拉面的描述", true, 2.1);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if (nums >= MAX_SIZE) {
            System.out.println("菜单满了！老板不做了！");
            return;
        }
        menuItems[nums++] = menuItem;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public MenuIterator iterator() {
        return new BRestaurantMenuIterator(menuItems);
    }
}
