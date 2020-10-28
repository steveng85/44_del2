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

    void rollDice(int d1, int d2) {
        gui.setDice(d1, d2);
    }
    void showMessage(String message){
        gui.showMessage(message);
    }
}
