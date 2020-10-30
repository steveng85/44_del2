package com.company;

import Game.Game;
import Game.GUI_Game;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0){
            new GUI_Game().startGame();
        } else {
          if (args[0].equalsIgnoreCase("gui"))
              new GUI_Game().startGame();
          else if (args[0].equalsIgnoreCase("Text"))
              new Game().startGame();
          else System.out.println("Not understood. Please type gui for GUI interface or text for text interface.");
        }


    }
}
