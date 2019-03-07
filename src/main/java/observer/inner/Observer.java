package observer.inner;

import java.util.Observable;

public class Observer implements java.util.Observer {

    /**
     * Subject, who`s send data.
     */
    Observable observable;

    /**
     * Constructor
     * @param o
     */
    Observer(Observable o) {
        this.observable = o;
    }

    /**
     * Update subject.
     */
    @Override
    public void update(Observable o, Object arg) {
        this.observable = o;
    }
}
