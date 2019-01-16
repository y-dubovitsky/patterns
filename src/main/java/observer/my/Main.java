package observer.my;

/**
 * Главный класс
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // Создание Субъекта
        CurrentObserver currentObserver = new CurrentObserver(weatherData); // Создание Наблюдателя
        currentObserver.register(); // Зарегистрировались в качестве наблюдателя
        for (int i = 0; i < 10; i++) {
            weatherData.setMeasurements((float)0.123 + i, (float)0.456 + i, (float)0.789 + i);
            currentObserver.display();
            if (i == 3) {
                System.out.println("Отписались от рассылки " + i);
                currentObserver.unregister();
            }
            if (i == 7) {
                System.out.println("Вновь решили подписаться " + i);
                currentObserver.register();
            }
            System.out.println();
        }
    }
}
