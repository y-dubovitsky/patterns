package strategy;

/**
 * Класс, реализующий поведение, золоженное в интерфейсе.
 */
public class FlyNoWay implements FlyBehavivor {

    /**
     * Метод, отвечающий за полет уток.
     */
    public void fly() {
        System.out.println("Sorry! I can`t");
    }
}
