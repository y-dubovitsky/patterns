package observer.inner;

import java.util.Observable;
import java.util.Observer;

/**
 * This class show how to use Observer from java library.
 */
public class Subject extends Observable {

    /**
     * Data
     */
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Invoke superclass method.
     * @param o
     */
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }
}
