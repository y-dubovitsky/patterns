package adapter.Birds;

/**
 * Адаптер для Утки, т.е. Утка будет вести себя как Индейка.
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    /**
     * Для этого в Адаптер передается Объект, который нужно адаптировать.
     * @param duck
     */
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
