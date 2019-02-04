package templateMethod.water;

/**
 * Спрайт, реализация шаблона: Шаблонный метод
 */
public class Cola extends Water {

    @Override
    public void drink() {
        System.out.println("Пьем Колу");
    }

    /**
     * Переопределяем метод перехватчик для изменения логики.
     * @return
     */
    @Override
    boolean hook() {
        return false;
    }
}
