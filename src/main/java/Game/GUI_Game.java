package Game;

public class GUI_Game {

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    int diceTotal = 0;
    Player player1;
    Player player2;
    Player currentPlayer;
    boolean gameInProgress = true;
    GUI_Controller gui_controller = new GUI_Controller();

    public void startGame() {
        gui_controller.makeGUI();
        player1 = new Player(gui_controller.player1Input());
        player2 = new Player(gui_controller.player2Input());
        currentPlayer = player1;
        gui_controller.addPlayers(player1, player2);

    }
}
