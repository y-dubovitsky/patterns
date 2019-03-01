package observer.paper;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implement Subject interface.
 */
public class Magazine implements Subject {

    /**
     * Data
     */
    String string;

    /**
     * List of observers.
     */
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        boolean result = false;
        for (int i = 0; i < observers.size(); i++) {
            if (observers.get(i).equals(observer)) {
                result = observers.remove(observer);
                break;
            }
        }
        return result;
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.string);
        }
    }

    /**
     * This method update Subject string and call notifyObserver method
     * that update date in all Observers.
     * @param string
     */
    public void updateState(String string) {
        this.string = string;
        notifyObserver();
    }
}
