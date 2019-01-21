package factory.my;

/**
 * Класс, декорируюет класс CheesePizza
 */
public class CheesePizzaMoscow extends CheesePizza {

    Pizza pizza;

    CheesePizzaMoscow(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String cut() {
        return pizza.cut() + " Московскую";
    }
}
