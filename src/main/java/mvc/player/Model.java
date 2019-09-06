package mvc.player;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

public class Model implements ModelInterface, MetaEventListener {

    Sequencer sequencer;

    /**
     * List of register observers
     */
    List<ObserverManage> manages = new ArrayList<>();
    List<ObserverDisplay> displays = new ArrayList<>();

    /**
     * Frequency
     */
    int bmp = 90;

    public void initialize() {
        //
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {
        this.bmp = bpm;
        sequencer.setTempoInBPM(getBPM());
        // when frequency changed, all observers notify by it
        notifyObservers();
    }

    @Override
    public int getBPM() {
        return this.bmp;
    }

    @Override
    public void registerObserverManege(ObserverManage observer) {

    }

    @Override
    public void unregisterObserverManage(ObserverManage observer) {

    }

    @Override
    public void registerObserverDisplay(ObserverDisplay display) {

    }

    @Override
    public void unregisterObserverDisplay(ObserverDisplay display) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
