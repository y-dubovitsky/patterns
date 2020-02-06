package factory.car;

/**
 * Этот класс создал для демонстрации применения шаблона Фабрика! В нем используется CarFactory для создния объектов, имплиментирующих интерфейс Сar. Обьекты создаются исходят из аргументов методово, которые передаются в метод фабрики.
 *
 * Например .produceCar("Mazda"); Создает объект типа Mazda
 */
public class Main {
    public static void main(String[] args) {
        Car mazda = CarFactory.produceCar("Mazda");
        Car nissan = CarFactory.produceCar("Nissan");
        mazda.drive();
        nissan.drive();
    }
}
