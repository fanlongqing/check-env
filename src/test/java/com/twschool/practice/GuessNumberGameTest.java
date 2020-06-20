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
    @Test
    public void should_return_succeed_when_compare_get_status_after_input_1234_given_game_with_answer_1234(){
        //given
        GameAnswer gameAnswer =new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame (gameAnswer);
        String result=guessNumberGame.guess("1 2 3 4");
        //When
        GameStatus gameStatus=guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.SUCCED,gameStatus);
    }

    @Test
    public void should_return_continued_when_compare_get_status_after_input_1243_given_game_with_answer_1234(){
        //given
        GameAnswer gameAnswer =new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame (gameAnswer);
        guessNumberGame.guess("1 2 4 3");
        //When
        GameStatus gameStatus=guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.CONTINUED,gameStatus);
    }
    @Test
    public void should_return_continued_when_compare_get_status_after_input_1243_6_given_game_with_answer_1234(){
        //given
        GameAnswer gameAnswer =new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame (gameAnswer);
        guessNumberGame.guess("1 2 4 3");
        guessNumberGame.guess("1 2 4 3");
        guessNumberGame.guess("1 2 4 3");
        guessNumberGame.guess("1 2 4 3");
        guessNumberGame.guess("1 2 4 3");
        guessNumberGame.guess("1 2 4 3");
        //When
        GameStatus gameStatus=guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.FAILD,gameStatus);
    }

}
