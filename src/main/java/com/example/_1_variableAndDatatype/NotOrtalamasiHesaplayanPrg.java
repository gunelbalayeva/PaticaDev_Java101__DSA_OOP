package com.example._1_variableAndDatatype;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanPrg {
    /*
    Ödev
   Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
   60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
  Not: Ternary Operator ya da Switch Case kullanarak yapılacak.
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int riyaziyyat, edebiyyat, kimiya, fizika, tarix, musiqi;
            System.out.print("Riyaziyyat:");
            riyaziyyat = sc.nextInt();
            System.out.print("Edebiyyat:");
            edebiyyat = sc.nextInt();
            System.out.print("Kimiya:");
            kimiya = sc.nextInt();
            System.out.print("Fizika:");
            fizika = sc.nextInt();
            System.out.print("Tarix:");
            tarix = sc.nextInt();
            System.out.print("Musiqi:");
            musiqi = sc.nextInt();

            double cem = riyaziyyat + edebiyyat + kimiya + fizika + tarix + musiqi;
            double netice = cem / 6.0;
            System.out.println("Neticeniz: " + netice);

            String fnl = (netice <= 60.0) ? "Kesildiniz" : "Ugurlar,kecdiniz";
            System.out.println(fnl);

        }
    }
}