package observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс демонстрирует применение библиотечного шаблона наблюдатель в Swing.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    /**
     * Назначает объекты слушателями (наблюдателями) событий кнопки.
     */
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it ?");
        // Назначает объекты слушателями (наблюдателями) событий кнопки.
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(new DevilListener());
//        Развернутое Лямбда выражение!
//        ActionListener actionListener = (e) -> {
//            System.out.println("Do it baby! Let`go fun! Rock-n-Roll");
//        };
//        button.addActionListener(actionListener);
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it baby! Let`go fun! Rock-n-Roll");
        }
    }
}
