package gui;

import javax.swing.*;
import java.awt.*;

public class Node {
    private final int x, y;
    private Type type = Type.DEFAULT;
    private Node up, down, left, right;
    private boolean start, end;
    public static int SIZE = 50;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node getUp() {
        return up;
    }

    public void setUp(Node up) {
        this.up = up;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        if (start) {
            this.type = Type.START;
        } else {
            this.type = Type.DEFAULT;
        }
        this.start = start;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        if (end) {
            this.type = Type.END;
        } else {
            this.type = Type.DEFAULT;
        }
        this.end = end;
    }

    public void draw(Graphics2D g, JPanel panel) {
        switch (type) {
            case START:
                g.setColor(Color.green);
                break;
            case END:
                g.setColor(Color.red);
                break;
        }

        g.fillRect(x * SIZE, y * SIZE, SIZE, SIZE);
        panel.revalidate();
        panel.repaint();
    }
}
