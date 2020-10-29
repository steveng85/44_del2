package com.company;

import Game.Game;
import Game.Field;
import Game.FieldFactory;
import Game.Dice;
import Game.Account;
import Game.Player;
import Game.GUI_Controller;



public class Test {
    public static void main(String[] args) {
        //For reference
        //Field[] list_of_fields = FieldFactory.makeFields();
        //System.out.println(list_of_fields[0].getDescription());

        new Game().startGame();
    }
}
