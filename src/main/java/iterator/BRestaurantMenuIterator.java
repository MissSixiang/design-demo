package iterator;


/**
 * @description
 * @author: yianmou
 **/
public class BRestaurantMenuIterator implements MenuIterator {

    private MenuItem[] menuItems;
    private int i = 0;

    public BRestaurantMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems != null && i < menuItems.length && menuItems[i] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[i++];
    }
}
