package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {
    @Test
    public void should_return_4A0B_when_compare_with_1234_given_answer_1234(){
        //given
//        int [] userAnswer={1,2,3,4};
        GameAnswer answer=new GameAnswer("1 2 3 4");
        //when
        String result=answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A4B_when_compare_with_1234_given_answer_4321(){
        //given
//        int [] userAnswer={1,2,3,4};
        GameAnswer answer=new GameAnswer("1 2 3 4");
        //when
        String result=answer.check("4 3 2 1");
        //then
        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_1A3B_when_compare_with_1234_given_answer_1423(){
        //given
//        int [] userAnswer={1,2,3,4};
        GameAnswer answer=new GameAnswer("1 2 3 4");
        //when
        String result=answer.check("1 4 2 3");
        //then
        Assert.assertEquals("1A3B",result);
    }
    @Test
    public void should_return_1A1B_when_compare_with_1234_given_answer_1356(){
        //given
//        int [] userAnswer={1,2,3,4};
        GameAnswer answer=new GameAnswer("1 2 3 4");
        //when
        String result=answer.check("1 3 5 6");
        //then
        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void should_return_0A3B_when_compare_with_1234_given_answer_7423(){
        //given
//        int [] userAnswer={1,2,3,4};
        GameAnswer answer=new GameAnswer("1 2 3 4");
        //when
        String result=answer.check("7 4 2 3");
        //then
        Assert.assertEquals("0A3B",result);
    }
}
