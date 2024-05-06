package com.example._1_variableAndDatatype;

import java.util.Scanner;

public class VucudKutleIndex {
    //Vücut Kitle İndeksi Hesaplama
    public static void main(String[] args) {
        double boy, ceki;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Boyunuzu daxil edin(metr):");
            boy = sc.nextDouble();
            System.out.print("Ceki daxil edin(metr):");
            ceki = sc.nextDouble();

            double netice = ceki /( boy * boy);
            System.out.println("Vucud Kutle Indexiniz: " + netice);
        }
    }
}
