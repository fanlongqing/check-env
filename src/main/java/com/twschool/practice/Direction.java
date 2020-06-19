package com.twschool.practice;

public enum Direction {
    N{
        @Override
        public void turnLeft(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("W");

        }
        @Override
        public void turnRight(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("E");
        }
    }
    ,W{
        @Override
        public void turnLeft(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("S");
        }

        @Override
        public void turnRight(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("N");
        }
    }
    ,S{
        @Override
        public void turnLeft(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("E");
        }

        @Override
        public void turnRight(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("W");
        }
    }
    ,E{
        @Override
        public void turnLeft(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("N");
        }

        @Override
        public void turnRight(MarsRoverPosition marsRoverPosition) {
            marsRoverPosition.setDirection("S");
        }
    };


    public abstract void turnLeft(MarsRoverPosition marsRoverPosition);

    public abstract void turnRight(MarsRoverPosition marsRoverPosition);
}
