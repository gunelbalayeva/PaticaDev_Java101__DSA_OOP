package com.example.finalProject;

public class MineSweeper {
    public static char[][] placeStars(int width, int height, int mineCount) {
        char[][] grid = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = '-';
            }
        }
        for (int k = 0; k < mineCount; k++) {
            int randomRow = (int) (Math.random() * height);
            int randomCol = (int) (Math.random() * width);
            grid[randomRow][randomCol] = '*';
        }

        return grid;
    }

    public static char[][] createRevealedGrid(int width, int height) {
        char[][] revealedGrid = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                revealedGrid[i][j] = '-';
            }
        }

        return revealedGrid;
    }

    public static void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidCoordinate(int row, int col, int width, int height) {
        return row >= 0 && row < height && col >= 0 && col < width;
    }

    public static int countNeighborMines(char[][] grid, int row, int col) {
        int count = 0;
        int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
        for (int i = 0; i < dx.length; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (isValidCoordinate(newRow, newCol, grid[0].length, grid.length) && grid[newRow][newCol] == '*') {
                count++;
            }
        }
        return count;
    }
}

