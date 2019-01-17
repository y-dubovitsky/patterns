package strategy;

/**
 * Утка-модель.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavivor = new FlyNoWay();
        this.quackBehavivor = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("Hello i`m a model duck!");
    }
}