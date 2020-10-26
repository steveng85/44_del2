package com.company;

public class Dice {
    private final int MAX = 6;
    private int eyeValue;

    public int Roll(){

        eyeValue = (int)(Math.random() * MAX) + 1;

        return eyeValue;
    }



}

