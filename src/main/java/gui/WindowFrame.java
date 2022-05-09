package gui;

import javax.swing.*;
import java.awt.*;

public class WindowFrame extends JFrame {
    private static final int SIZE = 1200;

    public WindowFrame() {
        ControlPanel controlPanel = new ControlPanel();
        LegendPanel legendPanel = new LegendPanel();
        GridPanel gridPanel = new GridPanel();

        JFrame windowFrame = new JFrame("Pathfinding Visualizer");
        windowFrame.setSize(SIZE, SIZE);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setResizable(false);
        windowFrame.setLayout(null);
        windowFrame.setVisible(true);
        windowFrame.setLayout(new BorderLayout());

        controlPanel.setPreferredSize(new Dimension(1000,200));
        legendPanel.setPreferredSize(new Dimension(200, 1000));

        windowFrame.add(controlPanel, BorderLayout.NORTH);
        windowFrame.add(legendPanel, BorderLayout.EAST);
        windowFrame.add(gridPanel);
    }
}
