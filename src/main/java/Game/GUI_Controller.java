package Game;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GUI_Controller {
    private GUI gui;
    void makeGUI() {
        GUI_Field[] fields = FieldFactory.makeGUIFields();

        gui = new GUI(fields, Color.gray);
    }

    public void addPlayers(Player p1, Player p2) {

        GUI_Player guiPlayer1 = new GUI_Player(
                p1.getName(),
                p1.getCoins(),
                new GUI_Car(Color.BLACK, Color.GRAY, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT));
        gui.addPlayer(guiPlayer1);

        GUI_Player guiPlayer2 = new GUI_Player(
                p2.getName(),
                p2.getCoins(),
                new GUI_Car(Color.WHITE, Color.RED, GUI_Car.Type.UFO, GUI_Car.Pattern.CHECKERED));
        gui.addPlayer(guiPlayer2);
    }

    public void rollDice(int d1, int d2) {
        gui.setDice(d1, d2);
    }

    public void showMessage(String message){
        gui.showMessage(message);
    }

    public String player1Input() {
        return gui.getUserString("Player 1 please enter your name: ");
    }
    public String player2Input() {
        return gui.getUserString("Player 2 please enter your name: ");
    }
}
