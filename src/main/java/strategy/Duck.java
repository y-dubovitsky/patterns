package strategy;

/**
 * Класс Утка.
 */
public abstract class Duck {
    /**
     * Переменные класса, реализующие поведение.
     */
    FlyBehavivor flyBehavivor;
    QuackBehavivor quackBehavivor;

    /**
     * Сеттер, для динамического изменения поведения.
     * @param flyBehavivor
     */
    public void setFlyBehavivor(FlyBehavivor flyBehavivor) {
        this.flyBehavivor = flyBehavivor;
    }

    /**
     * Сеттер, для динамического изменения поведения.
     * @param quackBehavivor
     */
    public void setQuackBehavivor(QuackBehavivor quackBehavivor) {
        this.quackBehavivor = quackBehavivor;
    }

    /**
     * Конструктор
     */
    public Duck() {}

    /**
     * Метод делегирует выполение объекту, реализующему интерфейс FlyBehavivor.
     */
    public void performFly() {
        flyBehavivor.fly();
    }

    /**
     * Метод делегирует выполение объекту, реализующему интерфейс QuackBehavivor.
     */
    public void performQuack() {
        quackBehavivor.quack();
    }

    /**
     * Метод отвечает за отображение утки, Метод объявлен абстрактным,
     * чтобы каждая утка реализовывала свой метод.
     */
    abstract public void display();
}
