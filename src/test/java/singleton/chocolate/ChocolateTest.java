package singleton.chocolate;

import org.junit.jupiter.api.Assertions;
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
}