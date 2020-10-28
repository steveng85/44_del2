package Game;

public class Player {
    private String name;
    private int points;
    private final int maxPoints = 3000;
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
}
