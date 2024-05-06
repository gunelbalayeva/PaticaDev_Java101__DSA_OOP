package com.example._4_methods;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter base number: ");
            int n = input.nextInt();
            System.out.print("Enter the exponent ");
            int e = input.nextInt();
            int total = 1;

            for (int i = 1; i <= e; i++) {
                total *= n;
            }
            System.out.println("pow(" + n + "," + e + ")" + " = " + total);

        }
    }
}
