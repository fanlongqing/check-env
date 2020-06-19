package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class GameAnswer {
    private final List<String> answerNumber;

    public GameAnswer(String answerString) {
        this.answerNumber=Arrays.asList(answerString.split(" "));
    }

    public String check(String userAnswerString) {
        List<String> userAnswerNumber= Arrays.asList(userAnswerString.split(" "));
//        for (int index=0;index<userAnswerNumber.size();index++){
//            if(answerNumber.get(index).equals(userAnswerNumber.get(index))){
//
//
//            }        }
        return "4A0B";
    }
}
