package observer.work;

/**
 * Интерфейс Субъект;
 * Обновляет данные в наблюдателях при их изменении или по запросу.
 */
public interface Subject {
    /**
     * Обновляем значения переменных в экземпляре Наблюдатель.
     */
    void updateObserver();

    /**
     * Обновляем текущие значения данных
     */
    void updateCurrentValue(Data data);

    /**
     * Обновление даных по запросу.
     */
    void updateRequest(Observer observer);

    /**
     * Добавляет наблюдателя
     */
    void addObserver(Observer observer);

    /**
     * Удаляет наблюдателя
     */
    void removeObserver(Observer observer);
}
