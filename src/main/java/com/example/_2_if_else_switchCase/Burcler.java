package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class Burcler {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Burcnuzu oyrenmek ucun doguldugunuz ayi daxil edin:");
            String ay = sc.nextLine();
            System.out.print("Doguldugunuz tarixi daxil edin:");
            int tarix = sc.nextInt();

            if (ay.equals("Yanvar")) {
                if (tarix <= 22) {
                    System.out.println("Oğlaq");
                } else {
                    System.out.println("Dolca");
                }
            }
            if (ay.equals("Fevral")) {
                if (tarix <= 19) {
                    System.out.println("Dolca");
                } else {
                    System.out.println("Baliqlar");
                }
            }
            if (ay.equals("Mart")) {
                if (tarix <= 21) {
                    System.out.println("Baliqlar");
                } else {
                    System.out.println("Qoc");
                }
            }
            if (ay.equals("Aprel")) {
                if (tarix <= 21) {
                    System.out.println("Qoc");
                } else {
                    System.out.println("Buga");
                }
            }
            if (ay.equals("May")) {
                if (tarix <= 22) {
                    System.out.println("Buga");
                } else {
                    System.out.println("Ekizler");
                }
            }
            if (ay.equals("Iyun")) {
                if (tarix <= 22) {
                    System.out.println("Ekizler");
                } else {
                    System.out.println("Xerceng");
                }
            }
            if (ay.equals("Iyul")) {
                if (tarix <= 23) {
                    System.out.println("Xerceng");
                } else {
                    System.out.println("Sir");
                }
            }
            if (ay.equals("Avqust")) {
                if (tarix <= 23) {
                    System.out.println("Sir");
                } else {
                    System.out.println("Qiz");
                }
            }
            if (ay.equals("Sentiyabr")) {
                if (tarix <= 23) {
                    System.out.println("Qiz");
                } else {
                    System.out.println("Terezi");
                }
            }
            if (ay.equals("Okyabr")) {
                if (tarix <= 22) {
                    System.out.println("Terezi");
                } else {
                    System.out.println("Eqreb");
                }
            }
            if (ay.equals("Noyabr")) {
                if (tarix <= 22) {
                    System.out.println("Eqreb");
                } else {
                    System.out.println("Oxatan");
                }
            }
            if (ay.equals("Dekabr")) {
                if (tarix <= 21) {
                    System.out.println("Oxatan");
                } else {
                    System.out.println("Oglaq");
                }
            }
        }
    }
}

