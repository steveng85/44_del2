package com.company;

public class Main {
    static Dice dice1 = new Dice();
    static Dice dice2 = new Dice();
    public void Turn() {

        dice1.roll();
        dice2.roll();
    }

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        var gui = new GUI_Controller();
        gui.makeGUI();
        // Dette er et forslag til setup med bestemte tal da vi endnu ikke at fået indsat vores dice fra del 1
        Thread.sleep(1000); // pauser programmet i 1000 milisekunder (basically its fancy af)
        gui.rollDice(dice1.roll(),dice2.roll());
        //Thread.sleep(1000);
        //gui.rollDice(dice1.Roll(),dice2.Roll());
    }
}
