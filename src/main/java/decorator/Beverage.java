package decorator;

/**
 * Класс абстрактного напитка
 */
public abstract class Beverage {
    /**
     * Описание напита
     */
    String description = "Абсрактный напиток";

    /**
     * Метод возвращает описание напитка.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Метод вычисляет стоимость напитка
     * @return
     */
    public abstract double cost();
}
