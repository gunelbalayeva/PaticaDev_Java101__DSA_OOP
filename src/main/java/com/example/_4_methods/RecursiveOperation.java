package com.example._4_methods;

import java.util.Scanner;

public class RecursiveOperation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("N Sayısı: ");
            int n = sc.nextInt();
            recursiveOperation(n);
        }
    }

    public static void recursiveOperation(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        if (n > 0) {
            recursiveOperation(n - 5);
            System.out.print(n + " ");
            recursiveOperation(n + 5);
        }
    }
}
