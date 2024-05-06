package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double riyaziyyat, edebiyyat, fizika, kimiya, musiqi;
            System.out.print("Riyaziyyat: ");
            riyaziyyat = input.nextDouble();
            System.out.print("Edebiyyat: ");
            edebiyyat = input.nextDouble();
            System.out.print("Fizika: ");
            fizika = input.nextDouble();
            System.out.print("Kimiya: ");
            kimiya = input.nextDouble();
            System.out.print("Musiqi: ");
            musiqi = input.nextDouble();

            double ortalama = (riyaziyyat + edebiyyat + fizika + kimiya + musiqi) / 5;
            if (ortalama >= 0 && ortalama <= 100) {
                if (ortalama <= 55) {
                    System.out.println("Sinifde qaldiniz.Ortalamaniz:" + ortalama);
                } else {
                    System.out.println("Tebrikler.Ortalamaniz:" + ortalama);
                }
            } else {
                System.out.println("Bu say kecersizdir:" + ortalama);
            }

        }
    }
}
