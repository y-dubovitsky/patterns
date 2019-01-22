package singleton.chocolate;

/**
 * Тестовый класс.
 */
public class MainChocolate {
    public static void main(String[] args) {
        // Создаем два объекта.
        Chocolate chocolate = Chocolate.getInstance();
        Chocolate chocolate1 = Chocolate.getInstance();
        System.out.println(chocolate.equals(chocolate1) ? "Да, мы один объект!" : "Нет, мы два разных объекта");
    }
}
