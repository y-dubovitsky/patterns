package strategy;

/**
 * Главный класс
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        //
        Duck duck1 = new ModelDuck();
        duck1.performQuack();
        duck1.setFlyBehavivor(new FlyLikaAG6());
        duck1.performFly();
    }
}
