package observer.my;

/**
 * Интерфейс - Наблюдатель; Реализуется всеми классами, которые наблюдают
 * за состояниями субъекта.
 */
public interface Observer {
    /**
     * Метод обновляет показания
     * @param temp, humidity, pressure - Данные состояния, передаваемые наблюдателям при изменении состояния
     * субъекта.
     */
    void update(float temp, float humidity, float pressure);
}
