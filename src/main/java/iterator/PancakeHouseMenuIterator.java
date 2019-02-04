package iterator;

import java.util.ArrayList;

/**
 * Итератор для PancakeHouseMenu.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> list;
    int position = 0;

    PancakeHouseMenuIterator(ArrayList<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size() || list.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem result = list.get(position);
        position++;
        return result;
    }
}
