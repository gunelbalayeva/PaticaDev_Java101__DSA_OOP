package com.example._3_loop;

import java.util.Scanner;

public class Factorial {
    // Faktöriyel hesaplayan fonksiyon
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Kombinasyon hesaplayan fonksiyon
    public static long combination(int n, int r) {
        long numerator = factorial(n);
        long denominator = factorial(r) * factorial(n - r);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("N değerini girin: ");
            int n = sc.nextInt();

            System.out.print("R değerini girin: ");
            int r = sc.nextInt();

            // Kombinasyonu hesapla ve ekrana yazdır
            System.out.println("C(" + n + "," + r + ") = " + combination(n, r));

        }
    }
}


