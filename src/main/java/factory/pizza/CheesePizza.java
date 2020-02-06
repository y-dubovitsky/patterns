package factory.pizza;

/**
 * Конкретная Сырная пицца
 */
public class CheesePizza implements Pizza {

    @Override
    public String cut() {
        return "Мы режем СЫРНУЮ пиццу";
    }

    @Override
    public void cook() {
        System.out.println("Мы готовим СЫРНУЮ пиццу");
    }

    @Override
    public void pack() {
        System.out.println("Мы упаковываем СЫРНУЮ пиццу");
    }
}
