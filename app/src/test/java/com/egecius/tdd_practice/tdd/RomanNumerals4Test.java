package com.egecius.tdd_practice.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RomanNumerals4Test {

    private RomanNumerals4 mSut;

    @Before
    public void setUp() {
        mSut = new RomanNumerals4();
    }

    @Test
    public void translate1() {
        String roman = mSut.translate(1);
        assertThat(roman).isEqualTo("I");
    }


    @Test
    public void translate2() {
        String roman = mSut.translate(2);
        assertThat(roman).isEqualTo("II");
    }



    @Test
    public void translate4() {
        String roman = mSut.translate(4);
        assertThat(roman).isEqualTo("IV");
    }

    @Test
    public void translate5() {
        String roman = mSut.translate(5);
        assertThat(roman).isEqualTo("V");
    }


    @Test
    public void translate6() {
        String roman = mSut.translate(6);
        assertThat(roman).isEqualTo("VI");
    }

    @Test
    public void translate9() {
        String roman = mSut.translate(9);
        assertThat(roman).isEqualTo("IX");
    }

    @Test
    public void translate10() {
        String roman = mSut.translate(10);
        assertThat(roman).isEqualTo("X");
    }


    @Test
    public void translate11() {
        String roman = mSut.translate(11);
        assertThat(roman).isEqualTo("XI");
    }




}