package templateMethod.water;

/**
 * Применяем шаблонный метод
 */
abstract public class Water {

    /**
     * Шаблонный метод
     */
    final void template() {
        extract();
        fill();
        drink();
        if (hook()) { // Перехватчие
            goBathroom();
        }
    }

    /**
     * Добываем воду из скважины
     */
    final void extract() {
        System.out.println("Мы добыли воду из колодца");
    }

    /**
     * Наливаем воду в бутылки.
     */
    final void fill() {
        System.out.println("Разлили водичку");
    }

    final void goBathroom() {
        System.out.println("Упс, пора в туалет");
    }

    /**
     * Этот метод должен быть реализован всеми подклассами;
     */
    abstract public void drink();

    /**
     * Метод перехватчик
     */
    boolean hook() {
        return true;
    }
}
