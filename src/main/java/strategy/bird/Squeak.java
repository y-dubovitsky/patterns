package strategy.bird;

/**
 * Класс, реализующий поведение, золоженное в интерфейсе.
 */
public class Squeak implements QuackBehavivor {

    public void quack() {
        System.out.println("Squeak! squuuuuueak!");
    }
}
