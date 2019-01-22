package singleton.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ChocolateTest {

    Chocolate chocolate;
    Chocolate chocolate1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        chocolate = Chocolate.getInstance();
        chocolate1 = Chocolate.getInstance();
    }

    /**
     * Проверяем два объекта на эквивалентность.
     */
    @Test
    void whenTwoObjectsEquals() {
        Assertions.assertEquals(chocolate, chocolate1);
    }

    /**
     * Пытаемся получить два разных экземпляра класса, реализующего
     * шаблон синглетон.
     */
    @Test
    @RepeatedTest(100) // Повторяем тест 100 раз
    void threadObjectsSingleton() {
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                chocolate = Chocolate.getInstance();
            }
        });
        Thread second = new Thread((new Runnable() {
            @Override
            public void run() {
                chocolate1 = Chocolate.getInstance();
            }
        }));
        first.run();
        second.run();
        Assertions.assertEquals(chocolate, chocolate1);
    }
}