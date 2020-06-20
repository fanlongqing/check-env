package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class FourBitRandomNumberTest {

    @Test
    public void should_return_different_fourbitrandom_is_false__given_game_start(){
        //given
        FourBitRandomNumber fourBitRandomNumber=new FourBitRandomNumber();
        String result =fourBitRandomNumber.randoms();
        //then
       boolean isbool= fourBitRandomNumber.checkDifferent(result);

        //then

        Assert.assertEquals(false,isbool);
    }
}

