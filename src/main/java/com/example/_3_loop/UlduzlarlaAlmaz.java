package com.example._3_loop;

import java.util.Scanner;

public class UlduzlarlaAlmaz {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Almazın yüksekliyi (tek ededle): ");
            int yukseklik = input.nextInt();

            // Üst
            for (int i = 1; i <= yukseklik; i += 2) {
                for (int j = 0; j < (yukseklik - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Alt
            for (int i = yukseklik - 2; i > 0; i -= 2) {
                for (int j = 0; j < (yukseklik - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

