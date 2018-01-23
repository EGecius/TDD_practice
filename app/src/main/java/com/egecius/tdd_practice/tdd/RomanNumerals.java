package com.egecius.tdd_practice.tdd;

public class RomanNumerals {

    String translateToRoman(int no) {

        StringBuilder stringBuilder = new StringBuilder();

        while (no >= 10) {
            String roman = "X";
            stringBuilder.append(roman);
            no = no - 10;
        }

        if (no == 9) {
            String roman = "IX";
            stringBuilder.append(roman);
            no = no - 9;
        }

        if (no >= 5) {
            String roman = "V";
            stringBuilder.append(roman);
            no = no - 5;
        }

        if (no == 4) {
            String roman = "IV";
            stringBuilder.append(roman);
            no = no - 4;
        }

        for (int j = 0; j < no; j++) {
            stringBuilder.append('I');
        }

        return stringBuilder.toString();
    }

}
