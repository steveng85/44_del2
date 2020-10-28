package Game;




public class Account {

    private final int MAX_COIN_AMOUNT;
    private final int DEFAULT_COIN_AMOUNT;
    private final int MIN_COIN_AMOUNT;
    private int coins;
    //money stuff here

    public Account(int maxCoinAmount, int defaultCoinAmount, int minCoinAmount) {
        this.MAX_COIN_AMOUNT = maxCoinAmount;
        this.DEFAULT_COIN_AMOUNT = defaultCoinAmount;
        this.MIN_COIN_AMOUNT = minCoinAmount;
        coins = DEFAULT_COIN_AMOUNT;
    }
    public void addCoins(int amount) {
        coins += amount;
    }

    public void reset() {
        coins = DEFAULT_COIN_AMOUNT;
    }

    public boolean isFull() {
        if (coins >= MAX_COIN_AMOUNT) {
            return true;
        }
        return false;
    }


    public int getCoins() {
        return coins;
    }

    //public String toString(int accountBalance) {
    //    return toString(accountBalance);
    //}
}
