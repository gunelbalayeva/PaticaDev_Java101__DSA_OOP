package com.example._5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Array length n: ");
            int n =sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Uzv: ");
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
