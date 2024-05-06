package com.example._3_loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int elemanSayisi = input.nextInt();

            int sayi1 = 0, sayi2 = 1;
            System.out.println(elemanSayisi + "Fibonacci Series:");
            for (int i = 1; i <= elemanSayisi; i++) {
                System.out.print(sayi1 + " ");

                int toplam = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = toplam;

            }
        }
    }
}