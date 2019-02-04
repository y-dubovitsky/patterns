package adapter.Birds;

/**
 * Паттерн Адаптер преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент.
 * Адаптер обеспечивает
 * совместную работу классов, невозможную в обычных условиях
 * из-за несовместимости интерфейсов.
 */
public class TestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Индюшка говорит...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Адаптированная Утка говорит...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();

        System.out.println("Еще одна адаптированная Инди-Утка");
        duckTest(mallardDuck);
        duckTest(turkeyAdapter);
    }

    /**
     * В метод передают Утку! Но можно и Индейку, адаптированную под утку!
     * @param duck
     */
    static void duckTest(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
