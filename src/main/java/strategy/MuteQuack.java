package strategy;

/**
 * Класс, реализующий поведение, золоженное в интерфейсе.
 */
public class MuteQuack implements QuackBehavivor {

    public void quack() {
        System.out.println("No quack! Tsssss...");
    }
}

