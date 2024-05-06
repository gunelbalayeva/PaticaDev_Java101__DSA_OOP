package com.example._5_arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayDublicate {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 2, 4, 6};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Tekrar edilen cut ededler:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1 && entry.getKey() % 2 == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}
