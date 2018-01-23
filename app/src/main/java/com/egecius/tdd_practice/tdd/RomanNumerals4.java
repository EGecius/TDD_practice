package com.egecius.tdd_practice.tdd;

public class RomanNumerals4 {
    String translate(int arabic) {

        int remainder = arabic;

        StringBuilder stringBuilder = new StringBuilder();

        if (remainder >= 10) {
            remainder = remainder - 10;
            stringBuilder.append("X");
        }

        if (remainder == 9) {
            return "IX";
        }


        if (remainder >= 5) {
            remainder = remainder - 5;
            stringBuilder.append("V");
        }

        if (remainder == 4) {
            return "IV";
        }

        for (int i = 0; i < remainder; i++) {
            stringBuilder.append("I");
        }

        return stringBuilder.toString();
    }
}
