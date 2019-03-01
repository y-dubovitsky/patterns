package observer.paper;

/**
 * Interface of Subject;
 */
public interface Subject {
    /**
     * Add observer.
     */
    void addObserver(Observer observer);

    /**
     * Remove observer from List.
     */
    boolean removeObserver(Observer observer);

    /**
     * Update data for all Observers.
     */
    void notifyObserver();
}
