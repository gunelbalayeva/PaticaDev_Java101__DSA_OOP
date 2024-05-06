package com.example._2_if_else_switchCase;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your username: ");
            String username = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();
            if (username.equals("patika") && password.equals("2024")) {
                System.out.println("You logged in!");
            } else {
                System.out.print("You are not logged in!");
                System.out.print("is pasword update? (Y/N):");
                String answer = input.nextLine();
                if (answer.equals("Y")) {
                    System.out.print("Enter new password: ");
                    String yesNewPassword = input.nextLine();
                    if (yesNewPassword.equals("2024")) {
                        System.out.println("It's not your new password. Please try again!");
                    } else {
                        System.out.println("Password is found.Your new password is: " + yesNewPassword);
                    }
                } else {
                    System.out.println("You are not logged in!");
                }
            }
        }
    }
}


