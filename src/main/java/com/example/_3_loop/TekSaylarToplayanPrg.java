package com.example._3_loop;

import java.util.Scanner;

public class TekSaylarToplayanPrg {

    public static void main(String[] args) {
        int total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.print("Eded daxil edin ve ya programi 0-a basaraq dayandirin: ");
                n = sc.nextInt();
                if (n % 2 == 0 && n % 4 == 0) {
                    total += n;
                }
            } while (n != 0);
            System.out.println("Total : " + total);
        }

    }
}

