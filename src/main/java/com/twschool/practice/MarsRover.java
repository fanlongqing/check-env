package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition=marsRoverPosition;
    }

    public MarsRoverPosition execute(String comands) {
        if("L".equals(comands)) {
            marsRoverPosition.setDirection("W");
        }
        if("M".equals(comands)) {
            marsRoverPosition.setY(marsRoverPosition.getY()+1);
        }
        if("R".equals(comands)) {
            marsRoverPosition.setDirection("E");
        }
        return marsRoverPosition;
    }
}
