package com.egecius.tdd_practice.tdd;

public class RomanNumerals2 {
    String translate(int arabic) {

        int remainder = arabic;

        StringBuilder stringBuilder = new StringBuilder();

        if (remainder == 4) {
            return "IV";
        } else if (remainder == 9) {
            return "IX";
        }

        if (remainder == 10) {
            return "X";
        }

        if (remainder > 5) {
            remainder = remainder - 5;
            stringBuilder.append("V");
        }

        if (remainder == 5) {
            return "V";
        }

        for (int j = 0; j < remainder; j++) {
            stringBuilder.append("I");
        }

        return stringBuilder.toString();
    }
}
