package decorator.my;

/**
 * Класс мороженое, расширяющий абстрактный декоратор.
 */
public class IceCream extends CondimentDecorator {
    Beverage beverage;

    public IceCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2.25 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " с Ванильным Мороженным!";
    }
}
