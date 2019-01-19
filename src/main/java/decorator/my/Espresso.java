package decorator.my;

/**
 * Класс БАЗОВОГО напитка- Эспрессо.
 */
public class Espresso extends Beverage {

    /**
     * Конструктор
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * @return - Возвращает цену напитка
     */
    public double cost() {
        return 1.99;
    }
}
