package com.egecius.tdd_practice.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

    private RomanNumerals mSut;

    @Before
    public void setUp() {
        mSut = new RomanNumerals();
    }

    @Test
    public void returns1() {
        String roman = mSut.translateToRoman(1);
        assertThat(roman).isEqualTo("I");
    }

    @Test
    public void returns2() {
        String roman = mSut.translateToRoman(2);
        assertThat(roman).isEqualTo("II");
    }

    @Test
    public void returns3() {
        String roman = mSut.translateToRoman(3);
        assertThat(roman).isEqualTo("III");
    }

    @Test
    public void returns4() {
        String roman = mSut.translateToRoman(4);
        assertThat(roman).isEqualTo("IV");
    }


    @Test
    public void returns5() {
        String roman = mSut.translateToRoman(5);
        assertThat(roman).isEqualTo("V");
    }

    @Test
    public void returns6() {
        String roman = mSut.translateToRoman(6);
        assertThat(roman).isEqualTo("VI");
    }

    @Test
    public void returns7() {
        String roman = mSut.translateToRoman(7);
        assertThat(roman).isEqualTo("VII");
    }


    @Test
    public void returns8() {
        String roman = mSut.translateToRoman(8);
        assertThat(roman).isEqualTo("VIII");
    }

    @Test
    public void returns9() {
        String roman = mSut.translateToRoman(9);
        assertThat(roman).isEqualTo("IX");
    }

    @Test
    public void returns10() {
        String roman = mSut.translateToRoman(10);
        assertThat(roman).isEqualTo("X");
    }

    @Test
    public void returns11() {
        String roman = mSut.translateToRoman(11);
        assertThat(roman).isEqualTo("XI");
    }

    @Test
    public void returns12() {
        String roman = mSut.translateToRoman(12);
        assertThat(roman).isEqualTo("XII");
    }

    @Test
    public void returns13() {
        String roman = mSut.translateToRoman(13);
        assertThat(roman).isEqualTo("XIII");
    }

    @Test
    public void returns14() {
        String roman = mSut.translateToRoman(14);
        assertThat(roman).isEqualTo("XIV");
    }

    @Test
    public void returns15() {
        String roman = mSut.translateToRoman(15);
        assertThat(roman).isEqualTo("XV");
    }


    @Test
    public void returns16() {
        String roman = mSut.translateToRoman(16);
        assertThat(roman).isEqualTo("XVI");
    }

    @Test
    public void returns17() {
        String roman = mSut.translateToRoman(17);
        assertThat(roman).isEqualTo("XVII");
    }

    @Test
    public void returns18() {
        String roman = mSut.translateToRoman(18);
        assertThat(roman).isEqualTo("XVIII");
    }

    @Test
    public void returns19() {
        String roman = mSut.translateToRoman(19);
        assertThat(roman).isEqualTo("XIX");
    }

    @Test
    public void returns20() {
        String roman = mSut.translateToRoman(20);
        assertThat(roman).isEqualTo("XX");
    }

    @Test
    public void returns21() {
        String roman = mSut.translateToRoman(21);
        assertThat(roman).isEqualTo("XXI");
    }

    @Test
    public void returns24() {
        String roman = mSut.translateToRoman(24);
        assertThat(roman).isEqualTo("XXIV");
    }


    @Test
    public void returns25() {
        String roman = mSut.translateToRoman(25);
        assertThat(roman).isEqualTo("XXV");
    }


    @Test
    public void returns29() {
        String roman = mSut.translateToRoman(29);
        assertThat(roman).isEqualTo("XXIX");
    }

    @Test
    public void returns39() {
        String roman = mSut.translateToRoman(39);
        assertThat(roman).isEqualTo("XXXIX");
    }


}