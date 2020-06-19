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
        int ANumber=0;
        int BNumber=0;
        for (int index=0;index<userAnswerNumber.size();index++){
            if(answerNumber.get(index).equals(userAnswerNumber.get(index))){
                ANumber++;
            }else if(answerNumber.contains(userAnswerNumber.get(index))){
                BNumber++;
            }
        }
        return  ANumber+"A"+BNumber+"B";
    }
}
