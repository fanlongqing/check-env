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







}
