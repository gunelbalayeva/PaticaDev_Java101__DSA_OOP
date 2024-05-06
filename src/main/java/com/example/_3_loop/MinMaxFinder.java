package com.example._3_loop;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Kaç tane sayı gireceksiniz: ");
            int n = input.nextInt();

            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Sayıyı giriniz: ");
                numbers[i] = input.nextInt();
            }
            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

        }
    }
}
