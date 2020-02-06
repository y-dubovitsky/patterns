package factory.pizza;

/**
 * Интерфейс абстрактного магазина пиццы.
 * Этот класс содержит реализацию всех методов для манипуляции с продуктами,
 * кроме фабричных методов.
 */
abstract class PizzaStore {
    /**
     * Фабричный метод, инкапсулирует создание объекта.
     * @param type - тип пиццы
     * @return - Получение конкретной пиццы из этого магазина
     */
    abstract Pizza pizzaFactory(Type type);

    public void order(Type type) {
        Pizza pizza = this.pizzaFactory(type);
        pizza.cook();
        System.out.println(pizza.cut());
        pizza.pack();
    }
}
