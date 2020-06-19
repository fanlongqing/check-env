package com.twschool.practice;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition=marsRoverPosition;
    }

    public MarsRoverPosition execute(String comands) {
        for (int i = 0;i<comands.length();i++) {
            marsRoverPosition.move(String.valueOf(comands.charAt(i)),marsRoverPosition.getDirection());
        }
        return marsRoverPosition;
    }

}
