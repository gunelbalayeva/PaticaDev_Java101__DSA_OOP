package com.example._4_methods;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Eded daxil edin: ");
            int sayi = sc.nextInt();
            if (isAsal(sayi)) {
                System.out.println(sayi + "  ASALDIR!");
            } else {
                System.out.println(sayi + " ASAL deyil");
            }
        }
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        return isAsal(sayi, sayi - 1);
    }

    private static boolean isAsal(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return isAsal(sayi, bolen - 1);
    }
}
