package com.egecius.tdd_practice.tdd;

public class RomanNumerals {

    String translateToRoman(int remainder) {

        StringBuilder stringBuilder = new StringBuilder();

        remainder = catchAll(remainder, stringBuilder, 90, "XC");
        remainder = catchAll(remainder, stringBuilder, 50, "L");
        remainder = catchAll(remainder, stringBuilder, 40, "XL");
        remainder = catchAll(remainder, stringBuilder, 10, "X");
        remainder = catchAll(remainder, stringBuilder, 9, "IX");
        remainder = catchAll(remainder, stringBuilder, 5, "V");
        remainder = catchAll(remainder, stringBuilder, 4, "IV");
        remainder = catchAll(remainder, stringBuilder, 1, "I");

        return stringBuilder.toString();
    }

    private int catchAll(int no, StringBuilder stringBuilder, int noToCatch10, String roman) {
        while (no >= noToCatch10) {
            stringBuilder.append(roman);
            no = no - noToCatch10;
        }
        return no;
    }

}
