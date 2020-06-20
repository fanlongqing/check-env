package com.twschool.practice;

public class GuessNumberGame {
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus;
    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer=gameAnswer;
    }

    public String guess(String userAnswerString) {
        String result= gameAnswer.check(userAnswerString);
        if("4A0B".equals(result)){
             gameStatus = GameStatus.SUCCED;
        }
        return  result;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}
