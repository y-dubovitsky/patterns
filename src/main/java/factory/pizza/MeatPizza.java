package factory.pizza;

/**
 * Мясная пицца; Можно сделать абстрактным классом.
 */
public class MeatPizza implements Pizza {

    @Override
    public String cut() {
        return "Мы режем МЯСНУЮ пиццу";
    }

    @Override
    public void cook() {
        System.out.println("Мы готовим МЯСНУЮ пиццу");
    }

    @Override
    public void pack() {
        System.out.println("Мы упаковываем МЯСНУЮ пиццу");
    }
}
