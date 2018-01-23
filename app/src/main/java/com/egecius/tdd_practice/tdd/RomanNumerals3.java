package com.egecius.tdd_practice.tdd;

public class RomanNumerals3 {

    String translate(int arabic) {

        int remainder = arabic;

        StringBuilder stringBuilder = new StringBuilder();

        remainder = extract(remainder, stringBuilder, 50, "L");
        remainder = extract(remainder, stringBuilder, 40, "XL");
        remainder = extract(remainder, stringBuilder, 10, "X");
        remainder = extract(remainder, stringBuilder, 9, "IX");
        remainder = extract(remainder, stringBuilder, 5, "V");
        remainder = extract(remainder, stringBuilder, 4, "IV");
        remainder = extract(remainder, stringBuilder, 1, "I");

        return stringBuilder.toString();
    }

    private int extract(int remainder, StringBuilder stringBuilder, int arabicToExtract,
            String romanToExtract) {

        while (remainder >= arabicToExtract) {
            remainder = remainder - arabicToExtract;
            stringBuilder.append(romanToExtract);
        }
        return remainder;
    }
}
