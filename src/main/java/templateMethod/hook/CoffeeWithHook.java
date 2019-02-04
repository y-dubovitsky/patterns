package templateMethod.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * Конкретный класс кофе с методом-перехватчиком.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Завариваем Кофе");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем Сахар и Сливки!");
    }

    /**
     * Перехватчик
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        return userInput().equals("n") ? false : true;
    }

    /**
     * Пользовательский ввод с консоли.
     * @return
     */
    private String userInput() {
        String str = null;
        System.out.println("Хотите добавить сахар и сливки? y/n");
        try(BufferedReader b = new BufferedReader(new InputStreamReader(System.in))) {
            str = b.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNullElse(str, "n");
    }
}
