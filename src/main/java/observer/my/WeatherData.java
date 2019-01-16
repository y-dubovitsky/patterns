package observer.my;

import java.util.ArrayList;

public class WeatherData implements Subject {
    /**
     * Список наблюдателей
     */
    ArrayList<? super Observer> list;

    /**
     * Показания датчиков
     */
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * Конструктор
     */
    WeatherData() {
        list = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            int index = list.indexOf(o);
            list.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = (Observer)list.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Метод каждый раз вызывается при обновлении данных.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Обновляем параметры датчик.
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); // Метод каждый раз вызывается при обновлении данных
    }
}
