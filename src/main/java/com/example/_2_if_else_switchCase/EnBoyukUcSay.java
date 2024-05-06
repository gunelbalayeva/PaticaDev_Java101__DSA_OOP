package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class EnBoyukUcSay {
    public static void main(String[] args) {
        // Kullanıcıdan 3 sayı al ve küçükten büyüğe sırala
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("1.num : ");
            int num1 = scanner.nextInt();
            System.out.print("2.num:");
            int num2 = scanner.nextInt();
            System.out.print("3.num: ");
            int num3 = scanner.nextInt();

            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println(num1 + " < " + num2 + " < " + num3);
                } else {
                    System.out.println(num1 + " < " + num3 + " < " + num2);
                }
            } else if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println(num2 + " < " + num1 + " < " + num3);
                } else {
                    System.out.println(num2 + " < " + num3 + " < " + num1);
                }
            } else {
                if (num1 <= num2) {
                    System.out.println(num3 + " < " + num1 + " < " + num2);
                } else {
                    System.out.println(num3 + " < " + num2 + " < " + num1);
                }
            }
        }
    }
}
