package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Grid {
    private final Node[][] grid;
    public Node start;
    public Node end;
    private final int rows, cols;

    public Grid(int rows, int cols) {
        this.grid = new Node[cols][rows];
        this.rows = rows;
        this.cols = cols;
        initializeGrid();
    }

    public void initializeGrid() {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                grid[col][row] = new Node(col, row);
            }
        }

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                setNeighbors(row, col);
            }
        }

        start = grid[0][0];
        start.setStart(true);
        end = grid[cols-1][rows-1];
        end.setEnd(true);
    }

    private void setNeighbors(int row, int col) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int[] direction : directions) {
            int neighborCol = direction[0] + col;
            int neighborRow = direction[1] + row;

            if (neighborCol >= 0 && neighborCol < cols && neighborRow >= 0 && neighborRow < rows) {

                if (Arrays.equals(direction, new int[]{1, 0})) {
                    grid[col][row].setDown(grid[neighborCol][neighborRow]);
                }
                if (Arrays.equals(direction, new int[]{-1, 0})) {
                    grid[col][row].setUp(grid[neighborCol][neighborRow]);
                }
                if (Arrays.equals(direction, new int[]{0, 1})) {
                    grid[col][row].setRight(grid[neighborCol][neighborRow]);
                }
                if (Arrays.equals(direction, new int[]{0, -1})) {
                    grid[col][row].setLeft(grid[neighborCol][neighborRow]);
                }
            }
        }
    }

    public Node getNode(int x, int y) {
        return grid[x][y];
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
}
