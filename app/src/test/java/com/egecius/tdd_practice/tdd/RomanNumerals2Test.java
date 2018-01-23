package com.egecius.tdd_practice.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RomanNumerals2Test {

    private RomanNumerals2 mSut;

    @Before
    public void setUp() {
        mSut = new RomanNumerals2();
    }

    @Test
    public void returns1() {
        String result = mSut.translate(1);
        assertThat(result).isEqualTo("I");
    }

    @Test
    public void returns2() {
        String result = mSut.translate(2);
        assertThat(result).isEqualTo("II");
    }

    @Test
    public void returns3() {
        String result = mSut.translate(3);
        assertThat(result).isEqualTo("III");
    }


    @Test
    public void returns4() {
        String result = mSut.translate(4);
        assertThat(result).isEqualTo("IV");
    }

    @Test
    public void returns5() {
        String result = mSut.translate(5);
        assertThat(result).isEqualTo("V");
    }

    @Test
    public void returns6() {
        String result = mSut.translate(6);
        assertThat(result).isEqualTo("VI");
    }


    @Test
    public void returns7() {
        String result = mSut.translate(7);
        assertThat(result).isEqualTo("VII");
    }

//    @Test
//    public void returns9() {
//        String result = mSut.translate(9);
//        assertThat(result).isEqualTo("IX");
//    }


}