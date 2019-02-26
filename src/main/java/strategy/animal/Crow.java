package strategy.animal;

/**
 * Конкретный класс, реализующий объект - ворона.
 */
public class Crow extends Animal {

    /**
     * В конструкторе создается конкретный объект, реализующий поведение вороны.
     */
    public Crow(Fly fly, Swim swim, Display display) {
        this.fly = fly;
        this.swim = swim;
        this.display = display;
    }
}
