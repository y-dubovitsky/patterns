package adapter.Birds;

/**
 * Конкретная Утка.
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Кря - Кря - Кря");
    }

    @Override
    public void fly() {
        System.out.println("I can fly! Tu-ru-ru!");
    }
}
