package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        var gui = new GUI_Controller();
        gui.makeGUI();
    // Dette er et forslag til setup med bestemte tal da vi endnu ikke at fået indsat vores dice fra del 1
        Thread.sleep(1000); // pauser programmet i 1000 milisekunder (basically its fancy af)
        gui.rollDice(1, 3);
        Thread.sleep(1000);
        gui.rollDice(6, 4);
    }
}
