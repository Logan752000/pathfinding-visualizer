package gui;

import java.util.Arrays;

public class Grid {
    private Node[][] grid;
    private int rows, cols;
    private int nodeSize;

    public Grid(int rows, int cols, int nodeSize) {
        this.grid = new Node[cols][rows];
        this.rows = rows;
        this.cols = cols;
        this.nodeSize = nodeSize;
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
}
