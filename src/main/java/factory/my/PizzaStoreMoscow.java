package factory.my;

/**
 * Конкретный создатель (класс), реализующий московскую пиццерию.
 */
public class PizzaStoreMoscow extends PizzaStore{

    /**
     * Фабричный метод изготовления пиццы
     * @param type - тип пиццы
     * @return - возвращает конкретную пиццу
     */
    public Pizza pizzaFactory(Type type) {
        Pizza pizza = null;
        if (type.getType().equals("Сырная")) {
            pizza = new CheesePizzaMoscow(new CheesePizza()); // Применяется Декоратор
        }
        if (type.getType().equals("Мясная")) {
            pizza = new MeatPizza();
        }
        return pizza;
    }
}
