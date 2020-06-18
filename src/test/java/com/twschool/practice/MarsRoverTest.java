package com.twschool.practice;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_W_given_0_0_N_and_L() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0, 0, "N");
        MarsRover marsRover = new MarsRover(initPosition);
        //when
        MarsRoverPosition marsRoverPosition = marsRover.execute("L");
        //then
//        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0, marsRoverPosition.getX());
        Assert.assertEquals(0, marsRoverPosition.getY());
        Assert.assertEquals("W", marsRoverPosition.getDirection());

    }
    @Test
    public void should_return_0_1_N_given_0_0_N_and_M() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0, 0, "N");
        MarsRover marsRover = new MarsRover(initPosition);
        //when
        MarsRoverPosition marsRoverPosition = marsRover.execute("M");
        //then
//        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0, marsRoverPosition.getX());
        Assert.assertEquals(1, marsRoverPosition.getY());
        Assert.assertEquals("N", marsRoverPosition.getDirection());

    }


}
