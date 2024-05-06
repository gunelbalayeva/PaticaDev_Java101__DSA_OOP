package com.example._3_loop;
import java.util.Scanner;

public class EBOB_EKOB {
    public static void main(String[] args) {
        int smaller;
        int ebob = 1;
        int i = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Please enter number2: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            smaller = num1;
        } else {
            smaller = num2;
        }

        int k = smaller;

        while (i <= smaller) {
            if (num1 % i == 0 && num2 % i == 0) {

                System.out.print(ebob + " ");
                ebob = i;
            }
            i++;
        }

        while (k >= 1) {
            if (num1 % k == 0 && num2 % k == 0) {
                ebob = k;
                System.out.print(ebob);
                break;
            }
            k--;
        }


        while (i<=(num1*num2)){
            if (i%num1==0 && i%num2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println((num1*num2)/ebob);
    }
    }

//            try (Scanner sc = new Scanner(System.in)) {
//                System.out.print("Enter the first number: ");
//                int n1 = sc.nextInt();
//                System.out.print("Enter the second number: ");
//                int n2 = sc.nextInt();
//
//                int ebob = 1; // Initialize ebob with 1
//
//                // Find the greatest common divisor (EBOB)
//                for (int i = 1; i <= n1 && i <= n2; ++i) {
//                    if (n1 % i == 0 && n2 % i == 0) {
//                        ebob = i;
//                    }
//                }
//
//                System.out.println("Greatest common divisor (EBOB) = " + ebob);
//            }
//        }


