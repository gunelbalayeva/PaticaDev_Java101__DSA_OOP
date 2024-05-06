package com.example._3_loop;

import java.util.Scanner;

public class DoWhileLogin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean askPasword = true;
            do {
                System.out.print("Enter your pasword: ");
                int password = sc.nextInt();
                if (password == 12345) {
                    System.out.print("True");
                    askPasword = false;
                } else {
                    System.out.print("False: ");
                }
            } while (askPasword);
        }
    }
}
