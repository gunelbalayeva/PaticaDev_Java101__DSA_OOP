package com.example._5_arrays;

import java.util.Scanner;

public class ArrayMatris {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Matrisin setır sayı (n): ");
            int n = scanner.nextInt();
            System.out.print("Matrisin sütun sayı (m): ");
            int m = scanner.nextInt();

            int[][] matrix = new int[n][m];

            // Kullanıcıdan matris elemanlarını alıyoruz
            System.out.println("Matrisin uzvlerini daxil edin:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int[][] transpose = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Matrisin Transpozu:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

