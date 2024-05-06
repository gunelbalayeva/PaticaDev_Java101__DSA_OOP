package com.example._1_variableAndDatatype;

import java.util.Scanner;

public class KDV_hesablayanPrg {
    public static void main(String[] args) {
        //Odev:
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        try (Scanner sc = new Scanner(System.in)) {
            double tutar, kdvOrani;
            System.out.print("Qiymet tutarini daxil edin : ");
            tutar = sc.nextDouble();
            if (tutar >= 0 && tutar <= 1000) {
                kdvOrani = 0.18;
            } else if (tutar > 1000) {
                kdvOrani = 0.08;
            } else {
                System.out.println("Gecersiz tutar girdiniz.");
                return;
            }
            double kdv = tutar * kdvOrani;
            double kdvliTutar = tutar + kdv;

            System.out.println("Tutar: " + tutar);
            System.out.println("KDV orani : " + kdvOrani);
            System.out.println("KDV'li tutar : " + kdvliTutar);
        }
    }
}
