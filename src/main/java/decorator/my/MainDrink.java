package decorator.my;

/**
 * Главный класс для запуска приложения.
 * ВАЖНО!!
 * В этой реализации не изменяются поля получившихся напитков!!
 * Поле description не изменяется!
 */
public class MainDrink {
    public static void main(String[] args) {
        // Кофе с молоком, двойным Виски и Мороженным.
        Beverage drink = new Espresso();
        drink = new Milk(drink);
        drink = new Whiskey(drink);
        drink = new Whiskey(drink);
        drink = new IceCream(drink);
        System.out.println(drink.getDescription());
        // А вот тут проблема!
        System.out.println(drink.description);
        // One more example:
        Beverage bigCoffe = new Espresso();
        bigCoffe.setSize(Beverage.Size.GRANDE);
        System.out.println("Цена за кофе " + bigCoffe.cost());
    }
}
