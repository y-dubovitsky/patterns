package strategy;

/**
 * Конкретная реализация утки
 */
public class MallardDuck extends Duck {

    /**
     * Конструктор
     */
    public MallardDuck() {
        this.flyBehavivor = new FlyNoWay();
        this.quackBehavivor = new Quack();
    }

    /**
     * Конкретное отображение утки.
     */
    public void display() {
        System.out.println("Это конкретное отображение MallardDuck");
    }
}
