package com.egecius.tdd_practice.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RomanNumerals3Test {

    private RomanNumerals3 mSut;

    @Before
    public void setUp() {
        mSut = new RomanNumerals3();
    }

    @Test
    public void translates1() {
        String result = mSut.translate(1);
        assertThat(result).isEqualTo("I");
    }

    @Test
    public void translates2() {
        String result = mSut.translate(2);
        assertThat(result).isEqualTo("II");
    }


    @Test
    public void translates4() {
        String result = mSut.translate(4);
        assertThat(result).isEqualTo("IV");
    }

    @Test
    public void translates5() {
        String result = mSut.translate(5);
        assertThat(result).isEqualTo("V");
    }

    @Test
    public void translates6() {
        String result = mSut.translate(6);
        assertThat(result).isEqualTo("VI");
    }

    @Test
    public void translates7() {
        String result = mSut.translate(7);
        assertThat(result).isEqualTo("VII");
    }

    @Test
    public void translates9() {
        String result = mSut.translate(9);
        assertThat(result).isEqualTo("IX");
    }

    @Test
    public void translates10() {
        String result = mSut.translate(10);
        assertThat(result).isEqualTo("X");
    }

    @Test
    public void translates11() {
        String result = mSut.translate(11);
        assertThat(result).isEqualTo("XI");
    }

    @Test
    public void translates12() {
        String result = mSut.translate(12);
        assertThat(result).isEqualTo("XII");
    }

    @Test
    public void translates14() {
        String result = mSut.translate(14);
        assertThat(result).isEqualTo("XIV");
    }

    @Test
    public void translates15() {
        String result = mSut.translate(15);
        assertThat(result).isEqualTo("XV");
    }


    @Test
    public void translates16() {
        String result = mSut.translate(16);
        assertThat(result).isEqualTo("XVI");
    }

    @Test
    public void translates19() {
        String result = mSut.translate(19);
        assertThat(result).isEqualTo("XIX");
    }


    @Test
    public void translates20() {
        String result = mSut.translate(20);
        assertThat(result).isEqualTo("XX");
    }

    @Test
    public void translates21() {
        String result = mSut.translate(21);
        assertThat(result).isEqualTo("XXI");
    }

    @Test
    public void translates24() {
        String result = mSut.translate(24);
        assertThat(result).isEqualTo("XXIV");
    }


    @Test
    public void translates25() {
        String result = mSut.translate(25);
        assertThat(result).isEqualTo("XXV");
    }

    @Test
    public void translates40() {
        String result = mSut.translate(40);
        assertThat(result).isEqualTo("XL");
    }

    @Test
    public void translates48() {
        String result = mSut.translate(48);
        assertThat(result).isEqualTo("XLVIII");
    }


    @Test
    public void translates49() {
        String result = mSut.translate(49);
        assertThat(result).isEqualTo("XLIX");
    }



    @Test
    public void translates50() {
        String result = mSut.translate(50);
        assertThat(result).isEqualTo("L");
    }

    @Test
    public void translates89() {
        String result = mSut.translate(89);
        assertThat(result).isEqualTo("LXXXIX");
    }



}