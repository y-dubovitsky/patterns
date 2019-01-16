package observer.my;

/**
 * Интерфейс - Субъект; Реализуется классом, который изменяет состояние и
 * оповещает об этом наблюдателей.
 */
public interface Subject {
    /**
     * Регистрирует наблюдателя.
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * Удаляет наблюдателя.
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * Этом метод вызывается для оповещения наблюдателей об изменении
     * состояния субъекта
     */
    void notifyObservers();
}
