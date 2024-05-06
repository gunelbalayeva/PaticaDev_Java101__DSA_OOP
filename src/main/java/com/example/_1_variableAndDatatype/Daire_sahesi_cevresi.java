package com.example._1_variableAndDatatype;

import java.util.Scanner;

public class Daire_sahesi_cevresi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double PI = 3.14;

            System.out.print("Dairenin yarıçapını giriniz: ");
            double yaricap = input.nextDouble();

            System.out.print("Merkez açısının ölçüsünü giriniz (derece cinsinden): ");
            double a = input.nextDouble();

            double alan = (PI * yaricap * yaricap * a) / 360;

            System.out.println("Daire Diliminin Alanı: " + alan);
        }
    }
}
