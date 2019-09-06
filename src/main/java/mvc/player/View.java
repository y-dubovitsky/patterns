package mvc.player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener, ObserverDisplay, ObserverManage {

    private ControllerInterface controller;
    private ModelInterface model;

    /**
     * Swing components of display
     */
    JFrame jFrame;
    JPanel jPanel;
    BeatBar beatBar;
    JLabel jLabel;

    /**
     * Swing components of manage
     */
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public View(ControllerInterface controller, ModelInterface model) {
        this.controller = controller;
        this.model = model;
        // register this object in model like ObManager and ObDisplay
        model.registerObserverManege((ObserverManage) this);
        model.registerObserverDisplay((ObserverDisplay) this);
    }

    public void createView() {
        // Swing comp
    }

    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            jLabel.setText("offline");
        } else {
            jLabel.setText("bmp is " + bpm);
        }
    }

    public void updateBeat() {
        beatBar.setValue(100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void createControls() {
        // Create all Swing components here
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }
}
