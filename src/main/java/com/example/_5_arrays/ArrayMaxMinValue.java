package com.example._5_arrays;

public class ArrayMaxMinValue {
    public static void main(String[] args) {
        int[] list = {56, 34, 45, 67, 77, 89,5};
        int max = list[0];
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
