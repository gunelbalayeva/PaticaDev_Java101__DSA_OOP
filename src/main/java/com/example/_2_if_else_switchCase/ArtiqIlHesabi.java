package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class ArtiqIlHesabi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Il daxil edin: ");
            int yil = input.nextInt();

            boolean artikYil = false;

            if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
                artikYil = true;
            }
            if (artikYil) {
                System.out.println(yil + " artiq ildir!");
            } else {
                System.out.println(yil + " deyil!");
            }

        }
    }
}
