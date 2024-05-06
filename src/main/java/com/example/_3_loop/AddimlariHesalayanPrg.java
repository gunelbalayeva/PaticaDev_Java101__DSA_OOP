package com.example._3_loop;

public class AddimlariHesalayanPrg {
    public static void main(String[] args) {
        //1643 = 1 + 6 + 4 + 3 = 14
        int a = 1643;
        int qaliq, bol, toplam = 0;
        bol = a / 1000; //1
        qaliq = a % 1000;
        toplam += bol; //
        System.out.println("Bol:" + bol);
        System.out.println("Qaliq:" + qaliq);
        System.out.println("Toplam:" + toplam);
// 2-ci
        int b = qaliq;
        System.out.println("B====:" + b);
        bol = b / 100;
        qaliq = b % 100;
        toplam += bol; //
        System.out.println("Bol:" + bol);
        System.out.println("Qaliq:" + qaliq);
        System.out.println("Toplam:" + toplam);
        // 3-cu
        int c = qaliq;
        System.out.println("C====:" + b);
        bol = c / 10;
        qaliq = c % 10;
        toplam += bol + qaliq; //
        System.out.println("Bol:" + bol);
        System.out.println("Qaliq:" + qaliq);
        System.out.println("Toplam:" + toplam);

    }
}
