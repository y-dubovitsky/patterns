package observer.paper;

/**
 * Concrete class, who's implements int. Observer
 */
public class Reader implements Observer{

    /**
     * Data
     */
    String string;

    /**
     * Subject
     */
    Subject subject;

    public Reader(Subject subject) {
        this.subject = subject;
    }

    /**
     * Register like Observer.
     */
    public void registerLikeObserver() {
        this.subject.addObserver(this);
    }

    /**
     * Decline subscribe.
     */
    public void resignFromSubscribe() {
        this.subject.removeObserver(this);
    }

    @Override
    public void update(String string) {
        this.string = string;
    }
}
