package Game;


public class Player {
    private String name;
    private final Account accountBalance;


    public Player(String name) {
        this.name = name;
        accountBalance = new Account(3000, 1000, 0);
    }

    public boolean checkWin() {
        //form for vinder besked til spiller x
        return accountBalance.isFull();
    }


    public void addCoins(int amount) {

        accountBalance.addCoins(amount);
    }

    public void resetAccount() {

        accountBalance.reset();
    }

    public String getName() {

        return name;
    }

    public int getCoins() {

        return accountBalance.getCoins();
    }

    /*
    private int points;
   // private final int maxPoints = 3000;
    private int lastRoll;
    private int currentRoll;

    public int getPoints() {
        return points;
    }

    public void changePoints(int points) {
        this.points += points;
        if (this.points >= maxPoints) {
            this.points = maxPoints;
        }
    }
    public void setRoll(int roll) {
        this.lastRoll = this.currentRoll;
        this.currentRoll = roll;
    }
    public int getLastRoll() { return this.lastRoll;}
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

     */
}
