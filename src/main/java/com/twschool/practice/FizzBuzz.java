package com.twschool.practice;

public class FizzBuzz {
    public String say1(int number){

        if(number%3==0){
            return "Fizz";
        }
        if (number%5==0)
        {
            return "Buzz";
        }
        if (number%7==0)
        {
            return "Whizz";
        }
        if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }
        if(number%3==0 && number%7==0){
            return "FizzWhizz";
        }
        if(number%5==0 && number%7==0){
            return "BuzzWhizz";
        }
        return String.valueOf(number);
    }
}
