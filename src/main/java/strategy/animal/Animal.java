package strategy.animal;

/**
 * Абстрактный класс Животного.
 */
abstract public class Animal {
    Fly fly;
    Swim swim;
    Display display;

    public Animal() {};

    /**
     * Все животные спят
     */
    public void sleep() {
        System.out.println("Sorry, i`m sleeping");
    }

    /**
     * Шаблон Стратегия. Во время выполнения меняется поведение объекта.
     * @param fly
     */
    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
