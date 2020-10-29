package Game;

import java.util.Arrays;
import java.util.Scanner;
import Game.Field;
import Game.FieldFactory;
import Game.Account;
import javafx.application.Application;


public class Game {

    Scanner input = new Scanner(System.in);

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    int diceTotal = 0;
    Player player1;
    Player player2;
    Player currentPlayer;
    boolean gameInProgress = true;
    int selectedLanguage;
    Language language = new Language();

    public void startGame() {
        System.out.println("Please select a language. Type 0 for English");
        selectedLanguage = input.nextInt();
        printWelcomeMessage();
        System.out.println(language.textInputName[selectedLanguage] + "1");
        String name1 = input.nextLine();
        player1 = new Player(name1);
        System.out.println(language.textInputName[selectedLanguage] +"2");
        String name2 = input.nextLine();
        player2 = new Player(name2);
        System.out.println(language.textContinue[selectedLanguage]);

        while (gameInProgress) { //Keeps game going until gameWon is called
                round();
        }
    }

    public void printWelcomeMessage() {
/*        System.out.println("Welcome to DiceGame!\n\n" +
                "The players each roll a set of dice, where the value of the roll is converted into points." +
                "\n\nYou win the game if you roll double when you have 40 points.\n\nIf you roll double 1s, your " +
                "points will be reset.\n\nRolling a double gives an extra turn.\n\nFor the 40 point + scenario, " +
                "where you hit double 1s, you do not win. Since the rule of waived points applies here instead.\n\n" +
                "Press enter to start a new game");
        input.nextLine();
        */
    }

    public void round() {
        if (input.nextLine().equals("")) {
            currentPlayer = player1;
            turn();
        }
        if (input.nextLine().equals("")) {
            currentPlayer = player2;
            turn();
        }
    }

    public void turn() {
        dice1.roll();
        dice2.roll();
        diceTotal = dice1.getEyeValue()+dice2.getEyeValue();
        Field[] list_of_fields = FieldFactory.makeFields(selectedLanguage);
        System.out.println(currentPlayer.getName() + " " + language.approaches[selectedLanguage] + " " + list_of_fields[diceTotal].getTitle());
        System.out.println(list_of_fields[diceTotal].getDescription());
        currentPlayer.addCoins(list_of_fields[diceTotal].getValue());
        if (list_of_fields[diceTotal].getExtraTurn()) {
            turn();
        }
        checkForWin();

    }

    public void checkForWin() {
        if (currentPlayer.checkWin()) {
            System.out.println("\n\n==========================================");
            System.out.println(language.congratulations[selectedLanguage] + currentPlayer.getName() + " " + language.hasReached[selectedLanguage]);
            if (currentPlayer == player1) {
                currentPlayer = player2;
            }
            else currentPlayer = player1;
            System.out.println(currentPlayer.getName() + " " + language.onlyHad[selectedLanguage] + " " + currentPlayer.getCoins() + " " + language.coins[selectedLanguage]);
            System.out.println("==========================================\n");
            System.exit(0);
        }
    }

}

