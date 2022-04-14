package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description
 * @author: yianmou
 **/
public class ARestaurantMenuIterator implements MenuIterator {

    private ArrayList<MenuItem> menuItems;
    private Iterator<MenuItem> iterator;

    public ARestaurantMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        iterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
