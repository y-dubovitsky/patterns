package decorator.my;

/**
 * Абстрактный декоратор класса, реализующего добавку к напитку.
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * Этот метод нужен для того, чтобы любое дополнение в ОБЯЗАТЕЛЬНОМ порядке
     * переопределяло метод getDescription из супер класса.
     * @return
     */
    public abstract String getDescription();
}
