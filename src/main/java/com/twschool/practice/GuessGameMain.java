package com.twschool.practice;

import java.util.Scanner;

public class GuessGameMain {
    public static void main(String[] args){
        FourBitRandomNumber fourBitRandomNumber=new FourBitRandomNumber();
        String result =fourBitRandomNumber.randoms();
        GameAnswer gameAnswer =new GameAnswer(result);
        GameStatus gameStatus=GameStatus.CONTINUED;
        GuessNumberGame guessNumberGame =new GuessNumberGame (gameAnswer);
        while (gameStatus==GameStatus.CONTINUED){
            System.out.print("输入:\n");
            Scanner scan = new Scanner(System.in);
            String read = scan.nextLine();
            String resultToal=guessNumberGame.guess(read);
            gameStatus=guessNumberGame.getStatus();
            System.out.println("结果："+resultToal+"\n");
            if(gameStatus==GameStatus.CONTINUED){
                System.out.println("继续");
            }
        }

    }
}
