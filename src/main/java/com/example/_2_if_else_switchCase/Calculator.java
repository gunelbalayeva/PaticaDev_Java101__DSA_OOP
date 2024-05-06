package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the second number:");
            int b = sc.nextInt();
            System.out.print("Enter the operators (+,  -,  *,  / ):");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Addition:" + (a + b));
                    break;
                case '-':
                    System.out.println("Substraction:" + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication:" + (a * b));
                    break;
                case '/':
                    System.out.println("Division:" + a / b);
                    break;
                default:
                    System.out.println("You have entered incorrect operator");
            }
        }
    }
}
