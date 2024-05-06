package com.example.finalProject;
import java.util.Scanner;

public class MainSweeper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter width:");
        int width = input.nextInt();
        System.out.print("Please enter height:");
        int height = input.nextInt();

        while (height < 2 || width < 2) {
            System.out.print("Height or width should be minimum 2! Please enter again:");
            System.out.print("Height:");
            height = input.nextInt();
            System.out.print("Width:");
            width = input.nextInt();
        }
        int totalElements = width * height;
        int mineCount = totalElements / 4;

        char[][] grid = MineSweeper.placeStars(width, height, mineCount);
        char[][] revealedGrid = MineSweeper.createRevealedGrid(width, height);
        int remainingCells = totalElements - mineCount;

        while (true) {
            MineSweeper.printGrid(revealedGrid);
            System.out.print("Enter row:");
            int row = input.nextInt() - 1;
            System.out.print("Enter column:");
            int col = input.nextInt() - 1;
            if (MineSweeper.isValidCoordinate(row, col, width, height)) {
                if (revealedGrid[row][col] != '-') {
                    System.out.println("This coordinate has been already chosen. Please enter a new coordinate.");
                    continue;
                }
                if (grid[row][col] == '*') {
                    System.out.println("BOOM! Game Over.");
                    break;
                } else {
                    int neighborMines = MineSweeper.countNeighborMines(grid, row, col);
                    revealedGrid[row][col] = (char) (neighborMines + '0');
                    remainingCells--;
                    if (remainingCells == 0) {
                        System.out.println("Congratulations! You have won the game!");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid coordinate. Please enter new coordinates.");
            }
        }
    }
}

