package mvc.player;

public interface ModelInterface {

    // logic methods
    void initialize();
    void on();
    void off();
    void setBPM(int value);
    int getBPM();

    // observer methods
    void registerObserverManege(ObserverManage observer);
    void unregisterObserverManage(ObserverManage observer);
    void registerObserverDisplay(ObserverDisplay display);
    void unregisterObserverDisplay(ObserverDisplay display);
}
