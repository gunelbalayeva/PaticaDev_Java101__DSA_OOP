package com.example._3_loop;

import java.util.Scanner;

public class CutSayTapanPrg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Reqem daxil edin:");
            int input = sc.nextInt();
            int toplam = 0;
            int eded = 0;
            for (int i = 0; i <= input; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    toplam += i;
                    eded++;
                    System.out.print(i + ",");
                }
            }
            if (eded > 0) {
                double ortalama = (double) toplam / eded;
                System.out.println();
                System.out.println("Ortalama: " + ortalama);
            }else {
                System.out.println("Yanlis hesablama");
            }
        }
    }
}