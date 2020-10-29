package test;
import Game.Dice;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void roll() {
        Dice d1 = new Dice();
        int value = d1.roll();

        for (int j = 0; j < 100; j++) {
            assertTrue("dice not lower than" + 1, value >= 1);
            assertTrue("dice not higher than" + 6, value <= 6);
        }

        System.out.println("Dice test made");
    }
}