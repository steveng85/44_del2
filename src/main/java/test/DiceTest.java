package test;

import com.company.Dice;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void roll() {
        Dice d1 = new Dice();
        int value = d1.roll();
        int i = 0;

        while (i < 100) {
            i++;

            assertTrue("dice not lower than" + 1, value >= 1);
            assertTrue("dice not higher than" + 6, value <= 6);

        }
        System.out.println("Dice test made");
    }
}