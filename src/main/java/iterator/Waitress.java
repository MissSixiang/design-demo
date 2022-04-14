package iterator;

/**
 * @description 女招待
 * @author: yianmou
 **/
public class Waitress {

    /** 服务员打印菜单 */
    public void printMenu(Menu... menus) {
        for (Menu menu : menus) {
            print(menu.iterator());
        }
    }

    private void print(MenuIterator iterator) {
        MenuItem menuItem;
        while (iterator.hasNext()) {
            menuItem = iterator.next();
            System.out.println(String.format("name=%s, desc=%s, price=%s", menuItem.getName(), menuItem.getDesc(),
                    menuItem.getPrice()));
        }
    }
}
