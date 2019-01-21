package observer.work;

import java.util.Arrays;

/**
 * Охотник за головами, сообщает соискателям, если появилась свободная вакансия!
 */
public class HeadHunter implements Subject {

    /**
     * Данные которые обновляются
     */
    Data data;

    /**
     * Размер массива
     */
    int size = 10;

    /**
     * Текущая позиция в массиве.
     */
    int current = 0;

    /**
     * Массив наблюдателей.
     */
    Observer[] observers = new Observer[size];

    /**
     * Обновляем текущие значения данных в самом объекте Субъекта;
     * и запускаем автоматическое обновление всех наблюдателей
     */
    public void updateCurrentValue(Data data) {
        this.data = data;
        this.updateObserver(); // обновляем данные всех наблюдателей
    }

    /**
     * По запросу обновляем данные для конкретного наблюдателя,
     * даже если он не в списке.
     */
    public void updateRequest(Observer observer) {
        observer.setParam(this.data); // Поставляет текущие параметры.
    }

    /**
     * Обновляем данные всех наблюдателей.
     */
    @Override
    public void updateObserver() {
        for (int i = 0; i < current; i++) {
            observers[i].setParam(this.data);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers[current] = observer;
        current++;
        if (current == observers.length) {
            Observer[] temp = Arrays.copyOf(observers, observers.length + 10);
            observers = temp;
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        for (int i = 0; i < current; i++) {
            if (observers[i].equals(observer)) { // Возможно, нужно проверить!
                System.arraycopy(observers, i, observers, i - 1, observers.length - 1);
            }
        }
    }
}
