package strategy;

/**
 * Конкретный класс, реализующий деревянную утку.
 */
public class WoodenDuck extends Duck {

    /**
     * Конструктор
     */
    WoodenDuck(FlyBehavivor flyBehavivor, QuackBehavivor quackBehavivor) {
        this.flyBehavivor = new FlyNoWay();
        this.quackBehavivor = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Кря-кря, я конкретная деревянная утка!");
    }
}
