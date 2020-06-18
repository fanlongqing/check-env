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





}
