package decorator.my;

/**
 * Класс, расширяющий абстрактный декоратор.
 */
public class Whiskey extends CondimentDecorator {
    /**
     * Основной напиток.
     */
    Beverage beverage;

    Whiskey(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " c Вискии";
    }

    @Override
    public double cost() {
        return 2.55 + beverage.cost();
    }
}
