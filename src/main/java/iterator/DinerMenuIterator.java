package iterator;

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
}
