package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class HavaPrg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Hava tempraturunu daxil edin:");
            int tempratur = sc.nextInt();
            if (tempratur <= 5) {
                System.out.println("Bu gun xizek sure bilersiniz");
            } else {
                if (tempratur <= 15) {
                    System.out.println("Bu gun sinemaya gede bilersiniz");
                }
                if (tempratur >= 25) {
                    System.out.println("Bu gun piknik etmek ucun ela fursetdir.");
                }
                if (tempratur > 25) {
                    System.out.println("Uzmek ucun mohtesem gundur.");
                }
            }
        }
    }
}
