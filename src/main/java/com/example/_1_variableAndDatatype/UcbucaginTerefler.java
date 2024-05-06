package com.example._1_variableAndDatatype;

import java.util.Scanner;
// Dik Üçgende Hipotenüs Bulan Program
public class UcbucaginTerefler {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            double c;
            System.out.print("Enter the a:");
            a = sc.nextInt();

            System.out.print("Enter the b:");
            b = sc.nextInt();

            c = Math.sqrt(a * a + b * b);
            System.out.println("The hypotenuse of the triangle: " + c);

            double u = (a + b + c) / 2;

            double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
            System.out.println("The area of the triangle: " + area);
        }
    }
}
