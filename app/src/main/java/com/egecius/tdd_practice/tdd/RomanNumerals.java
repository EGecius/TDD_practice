package com.egecius.tdd_practice.tdd;

public class RomanNumerals {

    String translateToRoman(int remainder) {

        StringBuilder stringBuilder = new StringBuilder();

        remainder = catchAll(remainder, stringBuilder, 10, "X");

        if (remainder == 9) {
            String roman9 = "IX";
            stringBuilder.append(roman9);
            remainder = remainder - 9;
        }

        remainder = catchAll(remainder, stringBuilder, 5, "V");

        String roman4 = "IV";
        int noToCatch4 = 4;

        if (remainder == noToCatch4) {
            stringBuilder.append(roman4);
            remainder = remainder - noToCatch4;
        }

        for (int j = 0; j < remainder; j++) {
            stringBuilder.append('I');
        }

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
