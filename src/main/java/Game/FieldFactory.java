package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import Game.Field;
import java.awt.*;

public final class FieldFactory {

    public static GUI_Field[] makeGUIFields() {
        gui_fields.GUI_Field[] fields = new GUI_Field[11];
        int i = 0;
        fields[i++] = new GUI_Street("Tower", "+250", "Congratulations! You reached the top of the tower and found a bag filled with money! You get 250 coins", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Crater", "-100", "Oh no! You fell into a crater and need to buy your way out with 100 coins", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Palace Gates", "+100", "BE PROUD! You kept the palace safe overnight and have been rewarded 100 coins for your bravery", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Cold Desert", "-20", "NOT AGAIN…! You forgot your jacket and will have to buy one for 20 coins to survive your trip in the cold desert", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Walled City", "+180", "YAY! You managed to climb over the walls and enter the walled city and a bystander gave you 180 coins for your amazing climbing skills", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Monastery", "0", "Guess what?? You found a monastery where you can take shelter for the night free of charge. Money has no value here", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Black Cave", "-70", "HELP! You found yourself lost in a cold, black cave. You pay a caveman 70 coins to guide you out.", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("Huts in the Mountain", "+60", "LUCKY YOU! You found an abandoned hut in the mountains filled with food, water, and 60 coins", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The Were-wall", "-80/Extra Turn", "AAAAUUUU! You tried chasing a werewolf  but accidentally ran into a wall and dropped 80 coins, but don't worry, you get to roll again", "", Color.WHITE, Color.BLUE);
        fields[i++] = new GUI_Street("The Pit", "-50", "Oh dang! You just dropped 50 coins in the pit and can't get them back!", "", Color.WHITE, Color.BLUE);
        fields[i] = new GUI_Street("Goldmine", "+650", "PARTYTIME! You dug out a gold nugget and sold it for 650 coins", "", Color.WHITE, Color.BLUE);

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