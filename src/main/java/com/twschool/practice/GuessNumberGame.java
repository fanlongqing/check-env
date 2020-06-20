package com.twschool.practice;

public class GuessNumberGame {
    private static final int MAX_TRY_TIMES = 6;
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus;
    private int leftTryTimes=MAX_TRY_TIMES;


    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer=gameAnswer;
    }

    public String guess(String userAnswerString) {
        String result= gameAnswer.check(userAnswerString);
        leftTryTimes--;
        if("4A0B".equals(result)){
             gameStatus = GameStatus.SUCCED;
        }else if(leftTryTimes==0){
            gameStatus=GameStatus.FAILD;
        }
        else
            {
            gameStatus = GameStatus.CONTINUED;
        }
        return  result;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}
