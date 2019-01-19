package decorator.my;

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
        double result = 0;
        switch (this.beverage.getSize()) {
            case TALL: result = this.beverage.cost() + 1.95;
            break;
            case VENTI: result = this.beverage.cost() + 7.95;
            break;
            case GRANDE: result = this.beverage.cost() + 15.95;
            break;
        }
        return result;
    }
}
