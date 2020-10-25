package com.company;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GUI_Controller {
    void makeGUI() {
        GUI_Field[] fields = {new GUI_Street(), new GUI_Street(), new GUI_Street()};
        GUI gui = new GUI(fields, Color.gray);
    }
}
