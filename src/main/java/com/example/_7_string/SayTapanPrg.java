package com.example._7_string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayTapanPrg {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Eded daxil edin: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println(" 0-100 arasinda  eded daxil edinş");
                if (isWrong) {
                    right++;
                    System.out.println("Xetali giris haqqiniz : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Giris haqqiniz azalacaq");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğrudur : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Xetali say giris etdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayı büyükdür.");
                } else {
                    System.out.println(selected + "  sayı kicikdir.");
                }

                wrong[right++] = selected;
                System.out.println("Qalan haqqiniz : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Yanlis texmin etdiniz.Yeniden cehd ede bilersiniz ! ");
            if (!isWrong) {
                System.out.println("Say texminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
