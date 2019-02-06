package iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Новое кафе.
 */
public class CafeMenu implements Menu{
    HashMap<String, MenuItem> menuItemHashMap = new HashMap<>();

    /**
     * Конструктор, в котором добавляются элементы меню.
     */
    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggi burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    /**
     * Добавляем элемент меню в хеш-таблицу.
     * В качестве ключа выступает название меню.
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem i = new MenuItem(name, description, vegetarian, price);
        this.menuItemHashMap.put(name, i);
    }

    /**
     * Итератор для всех ключей.
     * @return - iterator.
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemHashMap.values().iterator();
    }
}
