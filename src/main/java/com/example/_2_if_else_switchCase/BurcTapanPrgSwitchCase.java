package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class BurcTapanPrgSwitchCase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Doğum ayınızı girin: ");
            String ay = scanner.nextLine();
            System.out.print("Doğum tarihinizi girin: ");
            int tarih = scanner.nextInt();

            String burc = findBurc(ay, tarih);
            System.out.println("Burcunuz: " + burc);
        }
    }

    public static String findBurc(String ay, int tarih) {
        switch (ay) {
            case "Yanvar":
                return (tarih <= 22) ? "Oğlak" : "Kova";
            case "Fevral":
                return (tarih <= 19) ? "Kova" : "Balık";
            case "Mart":
                return (tarih <= 21) ? "Balık" : "Koç";
            case "Aprel":
                return (tarih <= 20) ? "Koç" : "Boğa";
            case "May":
                return (tarih <= 21) ? "Boğa" : "İkizler";
            case "Iyun":
                return (tarih <= 22) ? "İkizler" : "Yengeç";
            case "Iyul":
                return (tarih <= 22) ? "Yengeç" : "Aslan";
            case "Avqust":
                return (tarih <= 22) ? "Aslan" : "Başak";
            case "Sentiyabr":
                return (tarih <= 22) ? "Başak" : "Terazi";
            case "Oktyabr":
                return (tarih <= 22) ? "Terazi" : "Akrep";
            case "Noyabr":
                return (tarih <= 20) ? "Akrep" : "Yay";
            case "Dekabr":
                return (tarih <= 22) ? "Yay" : "Oğlak";
            default:
                return "Geçersiz ay";
        }
    }
}
