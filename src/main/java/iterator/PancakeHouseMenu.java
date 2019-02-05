package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    /**
     * Список с элементами меню.
     */
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList<MenuItem>();

        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    /**
     * Метод, добавляющий элементы в List.
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * Итератор из библиотеки java.
     */
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
