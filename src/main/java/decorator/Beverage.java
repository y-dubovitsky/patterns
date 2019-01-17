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
     * Размер порции.
     */
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

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
