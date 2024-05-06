package com.example._3_loop;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username, pasword;
        int right = 3;
        double balance = 1500;
        int select;
        try (Scanner sc = new Scanner(System.in)) {
            while (right > 0) {
                System.out.print("Enter your username: ");
                username = sc.nextLine();
                System.out.print("Enter your password: ");
                pasword = sc.nextLine();
                if (username.equals("patika") && pasword.equals("Dev123")) {
                    System.out.println("Welcome! You have successfully logged in!");
                    do {
                        System.out.println("1. Money added\n" +
                                "2. Withdraw money\n" +
                                "4. Check your balance\n" +
                                "4. Exit the program");
                        System.out.print("Select your option: ");
                        select = sc.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("What do you want to add money?:");
                                int price = sc.nextInt();
                                balance += price;
                                break;
                            case 2:
                                System.out.print("What amount of money do you want to withdraw?: ");
                                int withdrawMoney = sc.nextInt();
                                if (withdrawMoney <= balance) {
                                    balance -= withdrawMoney;
                                    System.out.println("Withdrawal successful. Balance: " + balance);
                                } else {
                                    System.out.println("Insufficient balance. Your current balance is: " + balance);
                                }
                                break;
                            case 3:
                                System.out.println("Your balance is: " + balance);
                                break;
                            case 4:
                                System.out.println("Exit the program");
                        }
                    } while (select != 4);
                    break;
                } else {
                    right--;
                    if (right == 0) {
                        System.out.println("Your profile is blocked.");
                    } else {
                        System.out.println("Sorry, but you are not logged in!");
                        System.out.println("Your again: " + right);
                    }
                }
            }
        }
    }
}
