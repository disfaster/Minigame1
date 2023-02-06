/**
 * Class: GameUI Class
 * Name: Gabriel Kerven
 * Date: 30 Jan 2023
 * Purpose: Player class to create player objects
 */

public class Player {
    //instance variables
    private boolean isAlive;
    private int location;

    //no arg constructor
    public Player(){
    }

    //arg constructor
    public Player(boolean isAlive, int location) {
        this.isAlive = isAlive;
        this.location = location;
    }

    //getters and setters
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
