package factory.pizza;

/**
 * Тип пиццы
 */
public class Type {

    private String name;

    Type(String name) {
        this.name = name;
    }

    /**
     * @return - Возвращает тип пиццы
     */
    public String getType() {
        return this.name;
    }
}
