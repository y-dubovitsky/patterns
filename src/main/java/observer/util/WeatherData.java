package observer.util;

import java.util.Observable;

/**
 * Класс показывает встроенную реализацию шаблона Наблюдатель.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged(); // Устанавливает флаг изменений в true;
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float
            pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}