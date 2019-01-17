package decorator;

/**
 * Класс, расширяющий дополнение.
 */
public class Milk extends CondimentDecorator {
    /**
     * Основной напиток
     */
    Beverage beverage;

    /**
     * Конструктор
     * @param beverage
     */
    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * @return - метод возвращает описание получившего напитка.
     */
    public String getDescription() {
        return this.beverage.getDescription() + " с Молоком";
    }

    /**
     * @return - метод возвращает цену основного напитка с добавлением молока
     */
    public double cost() {
        return this.beverage.cost() + .95;
    }
}
