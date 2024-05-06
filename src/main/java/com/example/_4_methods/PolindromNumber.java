package com.example._4_methods;

import java.util.Scanner;

public class PolindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPalindrom(num));
    }
    static boolean isPalindrom (int number){
        int temp = number,reverseNumber =0, lastNumber;
        while (temp!=0){
            lastNumber= temp % 10;
            reverseNumber = (reverseNumber*10)+ lastNumber;
            temp /=10;
        }
        if (number==reverseNumber)
            return true;
        else
            return false;
    }
}
