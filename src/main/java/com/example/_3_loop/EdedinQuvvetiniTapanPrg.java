package com.example._3_loop;

import java.util.Scanner;

public class EdedinQuvvetiniTapanPrg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name: ");
            int n = sc.nextInt();

            System.out.print("4-un quvvet: ");
            for (int i = 1; i <= n; i *= 4) {
                System.out.println(i);
            }
            System.out.print("5-in quvvet: ");
            for (int j = 1; j <= n; j *= 5) {
                System.out.println(j);
            }

        }
    }
}
