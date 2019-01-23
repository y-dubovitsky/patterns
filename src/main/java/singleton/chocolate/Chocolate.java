package singleton.chocolate;

/**
 * Синглетон.
 */
public class Chocolate {
    private boolean empty;
    private boolean boiled;
    /**
     * Статичесая переменная; ссылка на объект класса Chocolate!
     *  * Операции чтения/записи volatile переменной являются атомарными.
     *  * Результат операции записи значения в volatile переменную одним потоком,
     *  * становится виден всем другим потокам, которые используют эту переменную для чтения из нее значения.
     */
    private volatile static Chocolate chocolateInstance;

    /**
     * Приватный конструктор, может быть вызван только из этого класса.
     */
    private Chocolate() {
        this.empty = false;
        this.boiled = false;
    }

    /**
     * Создает единственный объект класса Chocolate, если такой объект уже существует,
     * то возвращает его.
     * Добавлен блок синхронизации! Синхронизированый блок кода может быть выполнен только одним потоком одновременно.
     */
    public static Chocolate getInstance() {
        if (chocolateInstance == null) {
            synchronized (Chocolate.class) {
                if (chocolateInstance == null) {
                    chocolateInstance = new Chocolate();
                }
            }
        }
        return chocolateInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = true;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
        // Довести содержимое до кипения
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
