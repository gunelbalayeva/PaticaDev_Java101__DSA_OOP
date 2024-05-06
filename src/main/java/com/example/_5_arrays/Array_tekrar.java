package com.example._5_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_tekrar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Arrayin uzunlugu: ");
            int n = input.nextInt();

            int[] arr = new int[n];

            System.out.println("Arrayin uzvlerini daxil edin:");
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". uzvu: ");
                arr[i] =input.nextInt();
            }

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                if (frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }

            // Frekansları ekrana yazdırıyoruz
            System.out.println("Tekrar Sayıları");
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
            }
        }
    }
}
