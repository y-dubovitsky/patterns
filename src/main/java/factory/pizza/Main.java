package factory.pizza;

/**
 * Тестируем нашу фабрику пиццы.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStoreMoscow pizzaStoreMoscow = new PizzaStoreMoscow();
        pizzaStoreMoscow.order(new Type("Сырная"));
    }
}
