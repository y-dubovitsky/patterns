package strategy;

/**
 * Класс, реализующий поведение, золоженное в интерфейсе.
 */
public class Quack implements QuackBehavivor {

    public void quack() {
        System.out.println("Hello, my friend! I say: quack! quack! quack!");
    }
}
