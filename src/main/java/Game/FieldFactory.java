package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import Game.Field;
import java.awt.*;

public final class FieldFactory {

    public static  GUI_Field[] makeGUIFields() {
        gui_fields.GUI_Field[] fields = new GUI_Field[13];
        int i = 2;
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
        Field[] fields = new Field[13];
        int i = 2;
        fields[i++] = new Field(2, "Tower", "Congratulations! You reached the top of the tower and found a bag filled with money you get 250 coins", 250, false);
        fields[i++] = new Field(3, "Crater", "Oh no! You fell into a crater and need to buy your way out with a 100 coins", -100, false);
        fields[i++] = new Field(4, "Palace gates", "BE PROUD! You kept the palace safe overnight and are rewarded 100 coins for your bravery", 100, false);
        fields[i++] = new Field(5, "Cold Desert", "NOT AGAIN…! You forgot your jacket and will have to buy one for 20 coins to survive your trip in the cold dessert", -20, false);
        fields[i++] = new Field(6, "Walled city", "YAY! You managed to climb over the walls and enter the walled city and a stand byer gives you 180 coins for your amazing climbing skills", 180, false);
        fields[i++] = new Field(7, "Monastery", "Guess what?? You found a monastery where you can take shelter for the night free of charge. Money has no value here", 0, false);
        fields[i++] = new Field(8, "Black cave", "HELP! You found yourself lost in a black cold cave, you pay a caveman 70 coins to guide you out of the cave", -70, false);
        fields[i++] = new Field(9, "Huts in the mountain", "LUCKY YOU! You found an abandon hut in the mountains filled with food, water and 60 coins", 60, false);
        fields[i++] = new Field(10, "The Were-wall", "AAAAUUUU! You tried chasing a werewolf  but accidently ran into a wall and lose 80 coins, but dont worry you get to roll again", -80, true);
        fields[i++] = new Field(11, "The pit", "Oh dang! You just dropped 50 coins in the pit and cant get it back0", -50, false);
        fields[i] = new Field(12, "Goldmine", "PARTYTIME! You dug out a goldnugget and sold it for 650 coins", 650, false);


        return fields;
    }

}