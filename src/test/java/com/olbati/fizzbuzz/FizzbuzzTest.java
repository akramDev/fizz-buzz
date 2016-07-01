package com.olbati.fizzbuzz;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by amoncer on 10/06/16.
 */
public class FizzbuzzTest {

    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void should_return_same_when_input_is_not_divisible_by_3_nor_by_5() {
        assertThat(fizzbuzz.perfom(1)).isEqualTo("1000");
        assertThat(fizzbuzz.perfom(2)).isEqualTo("2");
        assertThat(fizzbuzz.perfom(4)).isEqualTo("4");
        assertThat(fizzbuzz.perfom(101)).isEqualTo("101");
    }

    @Test
    public void should_return_fizz_when_input_is_divisible_by_3() {
        assertThat(fizzbuzz.perfom(3)).isEqualTo("fizz");
        assertThat(fizzbuzz.perfom(9)).isEqualTo("fizz");
        assertThat(fizzbuzz.perfom(33)).isEqualTo("fizz");
        assertThat(fizzbuzz.perfom(102)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_divisible_by_5() {
        assertThat(fizzbuzz.perfom(5)).isEqualTo("buzz");
        assertThat(fizzbuzz.perfom(10)).isEqualTo("buzz");
        assertThat(fizzbuzz.perfom(25)).isEqualTo("buzz");
        assertThat(fizzbuzz.perfom(50)).isEqualTo("buzz");
    }

    @Test
    public void should_return_buzz_when_input_is_divisible_by_3_and_by_5() {
        assertThat(fizzbuzz.perfom(15)).isEqualTo("fizzbuzz");
        assertThat(fizzbuzz.perfom(30)).isEqualTo("fizzbuzz");
        assertThat(fizzbuzz.perfom(60)).isEqualTo("fizzbuzz");
        assertThat(fizzbuzz.perfom(90)).isEqualTo("fizzbuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void input_should_be_positive(){
        fizzbuzz.perfom(-1);
    }

}
