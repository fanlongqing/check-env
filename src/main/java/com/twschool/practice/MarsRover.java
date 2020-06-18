package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition=marsRoverPosition;
    }

    public MarsRoverPosition execute(String comands) {
        for (int i = 0;i<comands.length();i++) {
            if("N".equals(marsRoverPosition.getDirection())) {
                    if ("L".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("W");
                    }
                    if ("M".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setY(marsRoverPosition.getY() + 1);
                    }
                    if ("R".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("E");
                    }

                }
            else if("W".equals(marsRoverPosition.getDirection())) {

                    if ("M".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setX(marsRoverPosition.getX() - 1);
                    }
                    if ("L".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("S");
                    }
                    if ("R".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("N");
                    }


            }

            else if("S".equals(marsRoverPosition.getDirection())) {

                    if ("M".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setY(marsRoverPosition.getY() - 1);
                    }
                    if ("L".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("E");
                    }
                    if ("R".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("W");
                    }

            }

            else if("E".equals(marsRoverPosition.getDirection())) {

                    if ("M".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setX(marsRoverPosition.getX() + 1);
                    }
                    if ("L".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("N");
                    }
                    if ("R".equals(String.valueOf(comands.charAt(i)))) {
                        marsRoverPosition.setDirection("S");
                    }
            }
    }
        return marsRoverPosition;
    }
}
