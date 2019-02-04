package iterator;

/**
 * Класс-клиент
 */
public class Client {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Client(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    Iterator dinerIterator() {
        return dinerMenu.createIterator();
    }

    Iterator pancakeIterator() {
        return pancakeHouseMenu.createIterator();
    }

    void showMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
