package factory.car;

/**
 * Класс Фабрика, который производит машины по типу.
 */
public class CarFactory {
    public static Car produceCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Mazda" : return new Mazda();
            case "Nissan" : return new Nissan();
            default: return null;
        }
    }
}
