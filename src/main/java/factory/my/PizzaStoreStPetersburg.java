package factory.my;

/**
 * Конкретный класс, реализующий петербургскую пиццерию.
 */
public class PizzaStoreStPetersburg extends PizzaStore {

    /**
     * Фабричный метод изготовления пиццы
     * @param type - тип пиццы
     * @return - возвращает конкретную пиццу
     */
    public Pizza pizzaFactory(Type type) {
        Pizza pizza = null;
        if (type.getType().equals("Сырная")) {
            pizza = new CheesePizza();
        }
        if (type.getType().equals("Мясная")) {
            pizza = new MeatPizza();
        }
        return pizza;
    }
}
