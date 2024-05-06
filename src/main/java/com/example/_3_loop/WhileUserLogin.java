package com.example._3_loop;

import java.util.Scanner;

public class WhileUserLogin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean isPassword = false;
            while (!isPassword) {
                System.out.print("Enter password: ");
                int password = sc.nextInt();

                // if ile yoxla
                if (password == 12345) {
                    System.out.println("You are logged in");
                    isPassword = true;
                } else {
                    System.out.println("You are not logged in");
                    isPassword = false;
                }
            }
        }
    }
}