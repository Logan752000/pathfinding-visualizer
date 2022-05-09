package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GridPanel extends JPanel implements MouseListener {
    private static final int SIZE = 1000;

    public GridPanel() {
        this.setBackground(Color.green);
        this.setBounds(0,200,SIZE,SIZE);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU HAVE CLICKED THE GRID PANEL");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("YOU HAVE ENTERED THE GRID PANEL");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("YOU HAVE EXITED THE GRID PANEL");
    }
}
