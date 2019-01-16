package observer.my;

/**
 * Класс, реализующий наблюдателя.
 */
public class CurrentObserver implements Observer, DisplayElement {

    /**
     * Показания датчиков, приходящие от наблюдателя.
     */
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject subject;

    /**
     * Конструктор
     * @param subject
     */
    public CurrentObserver(Subject subject) {
        this.subject = subject;
    }

    /**
     * Регистрация в Субъекте.
     */
    public void register() {
        this.subject.registerObserver(this);
    }

    /**
     * Отписаться от регистрации
     */
    public void unregister() {
        this.subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Влажность: " + this.humidity);
        System.out.println("Давление: " + this.pressure);
        System.out.println("Температура: " + this.temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
