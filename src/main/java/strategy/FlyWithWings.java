package strategy;

/**
 * Класс, реализующий поведение, золоженное в интерфейсе.
 */
public class FlyWithWings implements FlyBehavivor {

    /**
     * Метод, отвечающий за полет уток.
     */
    public void fly() {
        System.out.println("I can fly! Pur-Pur-Purrrr");
    }
}
