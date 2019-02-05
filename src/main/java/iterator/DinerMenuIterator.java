package iterator;

import java.util.Iterator;

/**
 * Итератор для DinerMenu
 */
public class DinerMenuIterator implements Iterator {

    MenuItem menuItem[];
    int position = 0;

    DinerMenuIterator(MenuItem[] menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItem.length || menuItem[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem result = this.menuItem[position];
        position++;
        return result;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (menuItem[position-1] != null) {
            for (int i = position-1; i < (menuItem.length-1); i++) {
                menuItem[i] = menuItem[i+1];
            }
            menuItem[menuItem.length-1] = null;
        }
    }
}
