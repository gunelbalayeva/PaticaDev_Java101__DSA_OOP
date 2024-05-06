package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class TeyyareBiletSifarisiPrg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double mesafeKm = 0.10;
            System.out.print("Gedeceyiniz mesafeni km tipinden daxil edin:");
            double km = sc.nextDouble();
            System.out.print("Yasinizi daxil edin:");
            int yas = sc.nextInt();
            // Musteriden alinacaq musbet reqemler
            if ((km <= 0) || (yas <= 0)) {
                System.out.println("Xahis edirik yalniz musbet reqem daxil edesiniz.Davam etmek ucun yeniden cehd edin!");
                return;
            }
            try (Scanner scanner = new Scanner(System.in)) {
                // Seyahet novu
                System.out.print("Seyahet novunu daxil edin: 1.Tek ucus. 2.Gedis-Donus :");
                int biletNov = scanner.nextInt();
                if (biletNov != 1 && biletNov != 2) {
                    System.out.println("Yanlis melumat daxil etdiniz");
                    return;
                }
                double biletQiymeti = km * mesafeKm;

                // Bilet endirim
                if (yas < 12) {
                    biletQiymeti -= biletQiymeti * 0.5;
                } else if (yas >= 12 && yas <= 24) {
                    biletQiymeti -= biletQiymeti * 0.1;

                } else if (yas <= 65) {
                    biletQiymeti -= biletQiymeti * 0.3;
                }

                if (biletNov == 2) {
                    biletQiymeti -= biletQiymeti * 0.2;

                }
                System.out.println("Bilet qiymeti: " + biletQiymeti);

            }

        }
    }
}

