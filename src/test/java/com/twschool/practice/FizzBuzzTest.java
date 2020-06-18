package com.twschool.practice;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_1_given_1() {
        //given

        //when
        String c = fizzBuzz.say1(1);
        //then
        Assert.assertEquals("1", c);

    }
    @Test
    public void should_return_Fizz_given_3() {
        //given

        //when
        String c = fizzBuzz.say1(3);
        //then
        Assert.assertEquals("Fizz", c);
    }
    @Test
    public void should_return_Buzz_given_5() {
        //given

        //when
        String c = fizzBuzz.say1(5);
        //then
        Assert.assertEquals("Buzz", c);
    }
    @Test
    public void should_return_Whizz_given_7() {
        //given

        //when
        String c = fizzBuzz.say1(7);
        //then
        Assert.assertEquals("Whizz", c);
    }
    @Test
    public void should_return_FizzBuzz_given_15() {
        //given

        //when
        String c = fizzBuzz.say1(15);
        //then
        Assert.assertEquals("FizzBuzz", c);
    }
    @Test
    public void should_return_FizzWhizz_given_21() {
        //given

        //when
        String c = fizzBuzz.say1(21);
        //then
        Assert.assertEquals("FizzWhizz", c);
    }
    @Test
    public void should_return_BuzzWhizz_given_35() {
        //given

        //when
        String c = fizzBuzz.say1(35);
        //then
        Assert.assertEquals("BuzzWhizz", c);
    }
    @Test
    public void should_return_FizzBuzzWhizz_given_105() {
        //given

        //when
        String c = fizzBuzz.say1(105);
        //then
        Assert.assertEquals("FizzBuzzWhizz", c);
    }







}
