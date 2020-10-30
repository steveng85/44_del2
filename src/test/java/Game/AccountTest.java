package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account makeStdAccount() {
        return new Account(3000, 0, 0);
    }


    @Test
    void addCoins() {
        tooMuch();
        System.out.println("making new account");
        tooLittle();

        System.out.println("\nMakes new account.");
        var account = makeStdAccount();
        account.addCoins(100);
        account.addCoins(20);
        account.addCoins(30);
        account.addCoins(-10);
        account.addCoins(-30);
        account.addCoins(50);
        account.addCoins(-100);
        System.out.println("Adds/subtracts 100+20+30-10-30+50-100 coins over multiple adds.");
        assertEquals(100+20+30-10-30+50-100, account.getCoins());
        System.out.println("Testing if subtraction and addition works correctly. It does.");
    }

    void tooMuch() {
        var account = new Account(3000, 0, 0);
        assertEquals(0, account.getCoins());
        System.out.println("Testing account starts with expected value (0). It does.");
        account.addCoins(3010);
        System.out.println("Adding 3010 coins.");
        assertEquals(3000, account.getCoins());
        System.out.println("Checks that coin value does not go above 3000. It does not.");
    }

    void tooLittle() {
        var account = new Account(3000, 0, 0);
        assertEquals(0, account.getCoins());
        System.out.println("Testing account starts with expected value (0). It does.");
        account.addCoins(-100);
        System.out.println("Adding -100 coins.");
        assertEquals(0, account.getCoins());
        System.out.println("Checks that coin value does not go below 0. It does not.");
    }

    @Test
    void reset() {
        var account = makeStdAccount();
        account.addCoins(200);
        System.out.println("Adds 200 coins");
        assertEquals(200,account.getCoins());
        System.out.println("Checks addCoins worked. It did.");
        account.reset();
        System.out.println("Resets account.");
        assertEquals(0,account.getCoins());
        System.out.println("Checks account has been resat. It has.");
    }

    @Test
    void isFull() {
        var account = makeStdAccount();
        account.addCoins(200);
        assertEquals(200,account.getCoins());
        System.out.println("Makes new account, adds 200 coins and checks that it worked. It did.");
        assertFalse(account.isFull());
        System.out.println("Checks that isFull is false. It is.");
        account.addCoins(3000);
        assertEquals(3000, account.getCoins());
        System.out.println("Adds 3000 coins and checks if it worked. It did");
        assertTrue(account.isFull());
        System.out.println("Checks isFull is correct. It is.");
    }

}