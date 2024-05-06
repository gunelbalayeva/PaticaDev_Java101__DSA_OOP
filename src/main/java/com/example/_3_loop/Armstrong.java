package com.example._3_loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Armstrong - 407 = (4^3)+ (0^3)+(7^3) = 64+0+343 = 407
        // Deyil - 1342 = (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16 = 354

        //  int a = 2451;
//  2451 / 10 =  245
//  245 / 10 = 24
//  24 / 10 = 2
// 2 / 10 = 0
// 0/ 10 = 0

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Eded daxil edin :");
            int number = input.nextInt();
            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int result = 0;
            int basPow;

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }

            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                // 1*1*1*1 = 1^4
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == number) {
                System.out.println(number + "  Armstrongdur");
            } else {
                System.out.println(number + " Armstrong deyil.");
            }
        }
    }
}
