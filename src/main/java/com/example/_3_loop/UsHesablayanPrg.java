package com.example._3_loop;

import java.util.Scanner;

public class UsHesablayanPrg {
    public static void main(String[] args) {
        // 3^4 = 3 * 3 * 3 * 3
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ozune vurmaq istediyiniz ededi daxil edin:");
            int a = sc.nextInt();//5
            System.out.print("Nece defe vurmaq istediyiniz ededi daxil edin:");
            int b = sc.nextInt(); // 2
            int total = 1;
            for (int i = 1; i <= b; i++) {
                total *= a;
            }
            System.out.println("Cavab: " + total);
        }
    }
}
