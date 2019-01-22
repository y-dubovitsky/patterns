package singleton.chocolate;

public class Chocolate {
    private boolean empty;
    private boolean boiled;
    /**
     * Статичесая переменная; ссылка на объект класса Chocolate!
     */
    private static Chocolate chocolateInstance;

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
     */
    public static Chocolate getInstance() {
        if (chocolateInstance == null) {
            chocolateInstance = new Chocolate();
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
