package Game;

import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player player1 = new Player();
    Player player2 = new Player();
    Player currentPlayer;
    boolean gameInProgress = true;

    public void startGame() {
        // Welcome the players
        printWelcomeMessage();
        //Player1 gives a name
        System.out.println("Input a name for Player1");
        String name1 = input.nextLine();
        player1.setName(name1);
        //player2 gives a name
        System.out.println("Input a name for Player2");
        String name2 = input.nextLine();
        player2.setName(name2);
        //Tells Who is who
        System.out.println("Player1 is " + player1.getName());
        System.out.println("Player2 is " + player2.getName());
        //Telling the players how to start the game
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

    }

    public void turn() {
        dice1.roll();
        dice2.roll();
        //
                System.out.println("You rolled a " + dice1.getEyeValue() + " and " + dice2.getEyeValue());
        //currentPlayer.changePoints(checkRollRules(dice1.getEyeValue()+dice2.getEyeValue())); //adds/subtracts points to players' totals here.
    }

    public void checkForWin() {

    }

    public void gameWon() {

    }


}

