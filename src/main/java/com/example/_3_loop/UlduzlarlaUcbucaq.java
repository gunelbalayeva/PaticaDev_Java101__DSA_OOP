package com.example._3_loop;

public class UlduzlarlaUcbucaq {
    public static void main(String[] args) {
        int n = 32;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
