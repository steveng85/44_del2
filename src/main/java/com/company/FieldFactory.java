package com.company;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import java.awt.*;

public final class FieldFactory {

    public static  GUI_Field[] makeGUIFields() {
        gui_fields.GUI_Field[] fields = new GUI_Field[11];
        int i = 0;
        fields[i++] = new GUI_Street("Tower", "+250", "2", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Crater", "-100", "3", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Palece gates", "+100", "4", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Cold Desert", "-20", "5", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Walled city", "+180", "6", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Monastary", "0", "7", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Black cave", "-70", "8", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Huts in the mountain", "+60", "9", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The Werewall", "-80/ekstra tur", "10", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The pit", "-50", "11", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Goldmine", "+650", "12", "", Color.WHITE, Color.BLUE);

        return fields;
    }

    public static  Field[] makeFields() {
        Field[] fields = new Field[11];
        int i = 0;
        fields[i++] = new Field(2, "Tower", "Congratulations! You have reached the top of the tower and found a bag filled with money you get 250 coins", 250, false);
        fields[i++] = new Field(3, "Crater", "Oh no! You fell into a crater and need to buy your way out with 100 coins", -100, false);
        fields[i++] = new Field(4, "Palece gates", "BE PROUD! You kept the palace safe overnight and are rewarded 100 coins for your bravery", 100, false);
        fields[i++] = new Field(5, "Cold Desert", "Wellcome to the tower, here is 250", -20, false);
        fields[i++] = new Field(6, "Walled city", "Wellcome to the tower, here is 250", 180, false);
        fields[i++] = new Field(7, "Monastary", "Wellcome to the tower, here is 250", 0, false);
        fields[i++] = new Field(8, "Black cave", "Wellcome to the tower, here is 250", -70, false);
        fields[i++] = new Field(9, "Huts in the", "Wellcome to the tower, here is 250", 60, false);
        fields[i++] = new Field(10, "The Werewall", "Wellcome to the tower, here is 250", -80, true);
        fields[i++] = new Field(11, "The pit", "Wellcome to the tower, here is 250", -50, false);
        fields[i++] = new Field(12, "Goldmine", "Wellcome to the tower, here is 250", 650, false);


        return fields;
    }

}