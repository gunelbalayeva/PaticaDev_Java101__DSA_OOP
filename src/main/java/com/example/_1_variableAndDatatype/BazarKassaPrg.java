package com.example._1_variableAndDatatype;

import java.util.Scanner;

public class BazarKassaPrg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double armudKg = 2.14, almaKg = 3.67, pomidorKg = 1.11, bananKg = 0.95, badimcanKg = 5.00;
            System.out.print("Armud nece kg?:");
            double armud = sc.nextDouble();
            System.out.print("Alma nece kg?:");
            double alma = sc.nextDouble();
            System.out.print("Pomidor nece kg?:");
            double pomidor = sc.nextDouble();
            System.out.print("Banan nece kg?:");
            double banan = sc.nextDouble();
            System.out.print("Badimcan nece kg?:");
            double badimcan = sc.nextDouble();

            double cem = (armud * armudKg) + (alma * almaKg) + (pomidor * pomidorKg) +
                    (banan * bananKg) + (badimcan * badimcanKg);
            System.out.println("Cemi Kg: " + cem + " AZN");

        }
    }
}
