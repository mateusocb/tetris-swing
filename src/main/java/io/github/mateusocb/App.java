package io.github.mateusocb;

import javax.swing.JFrame;

import static io.github.mateusocb.AppConstants.WINDOW_TITLE;
import io.github.mateusocb.core.GamePanel;

public class App {
    public static void main( String[] args ) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(Boolean.FALSE);
        window.setTitle(WINDOW_TITLE);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.setLocationRelativeTo(null);
        window.pack();

        window.setVisible(Boolean.TRUE);

        gamePanel.startThread();
    }
     
}