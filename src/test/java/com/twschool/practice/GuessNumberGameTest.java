package com.twschool.practice;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void should_return_0A4B_when_compare_with_4321_given_answer_1234(){
        //given
        GameAnswer gameAnswer =new GameAnswer("4 3 2 1");
        GuessNumberGame guessNumberGame =new GuessNumberGame (gameAnswer);
        //When
        String result=guessNumberGame.guess("1 2 3 4");
        //then
        Assert.assertEquals("0A4B",result);

    }
}
