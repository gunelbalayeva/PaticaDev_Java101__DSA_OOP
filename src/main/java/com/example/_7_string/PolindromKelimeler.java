package com.example._7_string;

public class PolindromKelimeler {
    public static void main(String[] args) {
        //abba, asa
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("baca"));
        System.out.println(isPalindrome2("abba"));
        System.out.println(isPalindrome2("baca"));

    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

   static boolean isPalindrome(String word) {
        int i =0;
        int j = word.length()-1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
