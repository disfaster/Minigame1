/**
 * Class: GameUI Class
 * Name: Gabriel Kerven
 * Date: 30 Jan 2023
 * Purpose: Exit class to create objects for exits
 */
public class Exit {
    //instance variable
    private String direction;
    private int destination;

    //no arg constructor
    public Exit(){
    }

    //arg constructor
    public Exit(String direction, int destination) {
        this.direction = direction;
        this.destination = destination;
    }

    //getters and setters
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    //toString method
    @Override
    public String toString() {
        return "Exit{" +
                "direction='" + direction + '\'' +
                ", destination=" + destination +
                '}';
    }
}
