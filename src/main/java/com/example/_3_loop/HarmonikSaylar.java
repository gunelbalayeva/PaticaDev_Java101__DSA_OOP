package com.example._3_loop;

import java.util.Scanner;

public class HarmonikSaylar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int number = sc.nextInt();
            double result = 0.0;
            for (int i = 1; i <= number; i++) {
                result += (1.0 /i);
            }
            System.out.println("Result: " + result);
        }
    }
}
