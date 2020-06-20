package com.twschool.practice;

public class GuessNumberGame {
    private final GameAnswer gameAnswer;

    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer=gameAnswer;
    }

    public String guess(String userAnswerString) {
        return gameAnswer.check(userAnswerString);
    }
}
