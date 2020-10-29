package Game;

import java.util.Scanner;
import Game.Field;
import Game.FieldFactory;
import Game.Account;



public class Game {

    Scanner input = new Scanner(System.in);

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    int diceTotal = 0;
    Player player1;
    Player player2;
    Player currentPlayer;
    boolean gameInProgress = true;
    Field[] list_of_fields = FieldFactory.makeFields();


    public void startGame() {
        printWelcomeMessage();
        System.out.println("Input a name for Player1");
        String name1 = input.nextLine();
        player1 = new Player(name1);
        System.out.println("Input a name for Player2");
        String name2 = input.nextLine();
        player2 = new Player(name2);
        System.out.println("Press enter to start and continue the game");

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
            System.out.println("\n\n----------------------------------------------");
            currentPlayer = player1;
            turn();
        }
        if (input.nextLine().equals("")) {
            System.out.println("\n\n----------------------------------------------");
            currentPlayer = player2;
            turn();
        }
    }

    public void turn() {
        roll();
        System.out.println(currentPlayer.getName() + " rolled " + diceTotal + " and approaches the " + list_of_fields[diceTotal].getTitle());
        System.out.println(list_of_fields[diceTotal].getDescription());
        currentPlayer.addCoins(list_of_fields[diceTotal].getValue());
        System.out.println("You now have " + currentPlayer.getCoins() + " coins!");

        if (list_of_fields[diceTotal].getExtraTurn()) {
            System.out.println("");

            turn();
        }
        checkForWin();

    }
    public void roll() {
        dice1.roll();
        dice2.roll();
        diceTotal = dice1.getEyeValue()+dice2.getEyeValue();
    }
    public void checkForWin() {
        if (currentPlayer.checkWin()) {
            System.out.println("\n\n==========================================");
            System.out.println("CONGRATULATIONS! " + currentPlayer.getName() + " has reached 3000 coins and won the game");
            if (currentPlayer == player1) {
                currentPlayer = player2;
            }
            else currentPlayer = player1;
            System.out.println(currentPlayer.getName() + " only had " + currentPlayer.getCoins() + " coins :(");
            System.out.println("==========================================\n");
            System.exit(0);
        }
    }

}

