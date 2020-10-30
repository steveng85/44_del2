package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import Game.Field;
import java.awt.*;

public final class FieldFactory {

    public static GUI_Field[] makeGUIFields() {
        gui_fields.GUI_Field[] fields = new GUI_Field[11];
        int i = 0;
        fields[i++] = new GUI_Street("Tower", "+250", "2", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Crater", "-100", "3", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Palace Gates", "+100", "4", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Cold Desert", "-20", "5", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Walled City", "+180", "6", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Monastery", "0", "7", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Black Cave", "-70", "8", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Huts in the Mountain", "+60", "9", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The Were-wall", "-80/Extra Turn", "10", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The Pit", "-50", "11", "", Color.WHITE, Color.BLUE);
        fields[i] = new GUI_Street("Goldmine", "+650", "12", "", Color.WHITE, Color.BLUE);

        return fields;
    }

    public static  Field[] makeFields(int languageIndex) {
        Field[] fields = new Field[13];
        int i = 2;
        Language language = new Language();
        fields[i++] = new Field(2, "Tower", language.fieldDescriptionTower[languageIndex], 250, false);
        fields[i++] = new Field(3, "Crater",language.fieldDescriptionCrater[languageIndex], -100, false);
        fields[i++] = new Field(4, "Palace Gates", language.fieldDescriptionPalaceGates[languageIndex], 100, false);
        fields[i++] = new Field(5, "Cold Desert", language.fieldDescriptionColdDesert[languageIndex], -20, false);
        fields[i++] = new Field(6, "Walled City", language.fieldDescriptionWalledCity[languageIndex], 180, false);
        fields[i++] = new Field(7, "Monastery", language.fieldDescriptionMonastery[languageIndex], 0, false);
        fields[i++] = new Field(8, "Black Cave", language.fieldDescriptionBlackCave[languageIndex], -70, false);
        fields[i++] = new Field(9, "Huts in the Mountain", language.fieldDescriptionHutsMountain[languageIndex], 60, false);
        fields[i++] = new Field(10, "The Were-wall", language.fieldDescriptionWerewall[languageIndex], -80, true);
        fields[i++] = new Field(11, "The pit", language.fieldDescriptionThePit[languageIndex], -50, false);
        fields[i] = new Field(12, "Goldmine", language.fieldDescriptionGoldMine[languageIndex], 650, false);


        return fields;
    }

}