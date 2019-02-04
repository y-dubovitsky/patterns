package templateMethod.hook;

/**
 * Пример возможного применения перехватчиков
 */
abstract public class CaffeineBeverageWithHook {

    /**
     * Шаблонный метод
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Кипятим воду");
    }

    void pourInCup() {
        System.out.println("Наливаем воду в чашку");
    }

    /**
     * Перехватчик
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
