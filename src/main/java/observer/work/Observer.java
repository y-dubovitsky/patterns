package observer.work;

/**
 * Интерфейс наблюдатель.
 */
public interface Observer {
    /**
     * Затребовать у Субъекта данные.
     */
    void getParam(Subject subject);

    /**
     * Устанавливаем данные.
     */
    void setParam(Data data);

    /**
     * Подписаться на рассылку данных от Субъекта
     */
    void subscribe(Subject subject);

    /**
     * Отписаться от получения данных
     */
    void unsubscribe(Subject subject);
}
