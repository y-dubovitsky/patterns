package templateMethod.water;

import java.io.Console;

/**
 * Тестовый метод
 */
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.template();

        // Почему консоль недоступна?
        Console console = System.console();
        if (console == null) {
            System.out.println("Консоль недоступна");
        }

        //
        Sprite sprite = new Sprite();
        sprite.template();
    }
}
