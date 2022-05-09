package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GridPanel extends JPanel implements MouseListener, MouseMotionListener {
    private static final int SIZE = 1000;
    private final int rows, cols;
    private Grid grid;
    private Node current = null;

    public GridPanel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Grid(rows, cols);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU HAVE CLICKED THE GRID PANEL");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX() / Node.SIZE;
        int y = e.getY() / Node.SIZE;

        current = grid.getNode(x, y);
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

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        super.paintComponent(g);

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                g.drawRect(col * Node.SIZE, row * Node.SIZE, Node.SIZE, Node.SIZE);
            }
        }
        grid.start.draw(graphics, this);
        grid.end.draw(graphics, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Node.SIZE * cols, Node.SIZE * rows);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX() / Node.SIZE;
        int y = e.getY() / Node.SIZE;

        if (SwingUtilities.isLeftMouseButton(e)) {
            if (current != null && current.isStart()) {
                current = grid.getNode(x, y);
                grid.setStart(current);
            }
        }
        if (SwingUtilities.isLeftMouseButton(e)) {
            if (current != null && current.isEnd()) {
                current = grid.getNode(x, y);
                grid.setEnd(current);
            }
        }

        this.revalidate();
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
