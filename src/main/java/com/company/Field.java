package com.company;

public class Field {
    private int fieldNumber;
    private String title;
    private String description;
    private int value;
    private boolean extraTurn;

    public Field(int fieldNumber, String title, String description, int value, boolean extraTurn) {
        this.fieldNumber = fieldNumber;
        this.title = title;
        this.description = description;
        this.value = value;
        this.extraTurn = extraTurn;
    }
}
