package com.twschool.practice;

public class MarsRoverPosition {
    private int x;
    private int y;
    private String direction;

    public MarsRoverPosition(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


    public void move(String comands,String direction) {
        if("N".equals(direction)){
            if ("M".equals(comands)) {
            setY(getY() + 1);
            }
             if ("L".equals(comands)) {
                setDirection("W");
             }
            if ("R".equals(comands)) {
                setDirection("E");
             }
        }else if("W".equals(direction)){
            if ("M".equals(comands)) {
                setX(getX() - 1);
            }
            if ("L".equals(comands)) {
                setDirection("S");
            }
            if ("R".equals(comands)) {
                setDirection("N");
            }
        }else if("S".equals(direction)){

            if ("M".equals(comands)) {
                setY(getY() - 1);
            }
            if ("L".equals(comands)) {
                setDirection("E");
            }
            if ("R".equals(comands)) {
                setDirection("W");
            }
        }   else if("E".equals(direction)){
            if ("M".equals(comands)) {
                setX(getX() + 1);
            }
            if ("L".equals(comands)) {
                setDirection("N");
            }
            if ("R".equals(comands)) {
                setDirection("S");
            }
        }

    }
}
