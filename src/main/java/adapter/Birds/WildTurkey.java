package adapter.Birds;

/**
 * Конкретный класс Дикой Индейки
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Курлык курлык!");
    }

    public void fly() {
        System.out.println("Прыг скок! Прыг скок! Полетели!");
    }
}
