package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class CinZodyakBurcu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Çin Zodyağınızı öğrenmek ucun doğulduğunuz ılı daxil edin ");
            int dogumIli = input.nextInt();

            String zodyak = "";
            switch (dogumIli % 12) {
                case 0:
                    zodyak = "Maymun";
                    break;
                case 1:
                    zodyak = "Xoruz";
                    break;
                case 2:
                    zodyak = "It";
                    break;
                case 3:
                    zodyak = "Domuz";
                    break;
                case 4:
                    zodyak = "Sican";
                    break;
                case 5:
                    zodyak = "Öküz";
                    break;
                case 6:
                    zodyak = "Peleng";
                    break;
                case 7:
                    zodyak = "Dovsan";
                    break;
                case 8:
                    zodyak = "Ejdaha";
                    break;
                case 9:
                    zodyak = "Ilan";
                    break;
                case 10:
                    zodyak = "At";
                    break;
                case 11:
                    zodyak = "Qoyun";
                    break;
                default:
                    System.out.println("Sehv giriş!");
                    return;
            }


            System.out.println("Çin Zodyak Burcunuz: " + zodyak);
        }
    }
}
