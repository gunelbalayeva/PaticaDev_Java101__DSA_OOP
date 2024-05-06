package com.example._5_arrays;

public class ArrayUzvOrtalamasi {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double awg = 0.0;
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        awg = sum / list.length;
        System.out.println(awg);

    }
}
