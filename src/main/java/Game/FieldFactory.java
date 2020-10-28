package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import Game.Field;
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
        fields[i++] = new GUI_Street("The Were-wall", "-80/Extra Turn", "10", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The pit", "-50", "11", "", Color.WHITE, Color.BLUE);
        fields[i] = new GUI_Street("Goldmine", "+650", "12", "", Color.WHITE, Color.BLUE);

        return fields;
    }

    public static  Field[] makeFields() {
        Field[] fields = new Field[11];
        int i = 0;
        fields[i++] = new Field(2, "Tower", "Welcome to the tower, here is 250 mcNuggets", 250, false);
        fields[i++] = new Field(3, "Crater", "Welcome to the tower, here is 250 big macs", -100, false);
        fields[i++] = new Field(4, "Palace gates", "Welcome to the tower, here is 250 pizzas", 100, false);
        fields[i++] = new Field(5, "Cold Desert", "Welcome to the tower, here is 250 elephants", -20, false);
        fields[i++] = new Field(6, "Walled city", "Welcome to the tower, here is 250 spaceships", 180, false);
        fields[i++] = new Field(7, "Monastery", "Welcome to the tower, here is 250 apple strudels", 0, false);
        fields[i++] = new Field(8, "Black cave", "Welcome to the tower, here is 250 whip lashes", -70, false);
        fields[i++] = new Field(9, "Huts in the", "Welcome to the tower, here is 250 high-fives", 60, false);
        fields[i++] = new Field(10, "The Were-wall", "Welcome to the tower, here is 250", -80, true);
        fields[i++] = new Field(11, "The pit", "Welcome to the tower, here is 250", -50, false);
        fields[i] = new Field(12, "Goldmine", "Welcome to the tower, here is 250", 650, false);


        return fields;
    }

}