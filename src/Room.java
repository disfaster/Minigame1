/**
 * Class: GameUI Class
 * Name: Gabriel Kerven
 * Date: 30 Jan 2023
 * Purpose: Room class to create room objects(one no arg constructor and one arg constructor
 */

import java.util.ArrayList;

public class Room {
    //instance variables
    private int roomNum;
    private String roomName;
    private ArrayList<String> description;
    private boolean isVisited;
    private ArrayList<Exit> exits;

    //no arg Room constructor
    public Room(){
    }

    //arg Room constructor
    public Room(int roomNum, String roomName, ArrayList<String> description, boolean isVisited, ArrayList<Exit> exits) {
        this.roomNum = roomNum;
        this.roomName = roomName;
        this.description = description;
        this.isVisited = isVisited;
        this.exits = exits;
    }

    //getters and setters
    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }
}
