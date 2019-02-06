package iterator;

import java.util.Iterator;

/**
 * Класс-клиент
 */
public class Client {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Client(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    java.util.Iterator<MenuItem> dinerIterator() {
        return dinerMenu.createIterator();
    }

    java.util.Iterator<MenuItem> pancakeIterator() {
        return pancakeHouseMenu.createIterator();
    }

    Iterator<MenuItem> cafeIterator() { return cafeMenu.createIterator();}

    /**
     * Полиморфный перебор
     * @param iterator
     */
    void showMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
