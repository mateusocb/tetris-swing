package io.github.mateusocb.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.util.Objects.nonNull;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    private static final int SCREEN_WIDTH = 400;
    private static final int SCREEN_HEIGHT = 800;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(Boolean.TRUE);
    }

    public void startThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (nonNull(gameThread)) {
            System.out.println("Game thread is runing!");

            update();

            repaint();
        }
    }

    public void update() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setColor(Color.CYAN);

        graphics2D.fillRect(50, 50, 40, 40);

        graphics2D.dispose();
    }

}
