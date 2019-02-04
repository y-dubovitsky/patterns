package adapter.Birds;

/**
 * Адаптер утки
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * В конструкторе получаем индейку
     * @param turkey
     */
    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * В методе УТКИ, вызываем метод 'голос' у Индейки.
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * В методе УТКИ, вызываем метод 'полета' у Индейки.
     */
    @Override
    public void fly() {
        turkey.fly();
    }
}
