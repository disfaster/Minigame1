/**
 * Class: GameUI Class
 * Name: Gabriel Kerven
 * Date: 30 Jan 2023
 * Purpose: Tester class for Minigame 1
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public GameUI(){
    }

    public void movePlayer(Player p, ArrayList<Room> room){
        boolean x = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Where would you like to go?");
        while(x){
            String move = in.nextLine();
            for (Exit ex : room.get(p.getLocation()).getExits()){
                if(move.equalsIgnoreCase(ex.getDirection())){
                    p.setLocation(ex.getDestination());
                    break;
                }
                else{
                    System.out.println("Invalid Command, try again.");
                }
            }
            break;
        }
    }

    public void printRoom(Player p1, ArrayList<Room> r){
        System.out.println(r.get(p1.getLocation()).getRoomNum());
        System.out.println(r.get(p1.getLocation()).getRoomName());
        System.out.println(r.get(p1.getLocation()).getDescription());
        System.out.println(r.get(p1.getLocation()).getExits().toString());
        r.get(p1.getLocation()).setVisited(true);
    }

    public static void main(String[] args) throws FileNotFoundException {

        //create a Room type ArrayList  (1)
        ArrayList<Room> rooms = new ArrayList<Room>();

        Scanner readRoomFile = null;
        //(2)
        File file ;
        try {
            file = new File("room.txt");
            readRoomFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        }
        try {
            while (readRoomFile.hasNextLine()) {

               int roomNumber = Integer.parseInt(readRoomFile.nextLine());

               String rName = readRoomFile.nextLine();
                ArrayList<String> description = new ArrayList<String>();

                String desciptionLine = readRoomFile.nextLine();
                description.add(desciptionLine);
                while (!desciptionLine.equalsIgnoreCase("----")) {
                    desciptionLine = readRoomFile.nextLine();
                    if (desciptionLine.equalsIgnoreCase("----")) {
                        break;
                    }
                    description.add(desciptionLine);
                }
                ArrayList<Exit> exits = new ArrayList<Exit>();
                String exit = readRoomFile.nextLine();
                //call split .  use the delimiter of " "
                String[] x = exit.split(" ");
                exits.add(new Exit(x[0], Integer.parseInt(x[1])));

                //add each object to Exit type ArrayList
                while (!exit.equalsIgnoreCase("----")) {
                    exit = readRoomFile.nextLine();
                    if (exit.equalsIgnoreCase("----")) {
                        break;
                    }
                    x = exit.split(" ");
                    exits.add(new Exit(x[0], Integer.parseInt(x[1])));
                }
                boolean visited = false;
                rooms.add(new Room(roomNumber, rName, description, visited, exits));
//                System.out.println(exits.toString());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }

        GameUI game = new GameUI();
        Scanner input = new Scanner(System.in);
        boolean h = true;
        while (h) {
            System.out.println("Welcome to the Maze Game.");
            System.out.println("If you would like to play, please type: PLAY");
            System.out.println("If you would not like to play, please type: EXIT");
            String start = input.nextLine();
            if (start.equalsIgnoreCase("PLAY")) {
                System.out.println("Game Started");
                break;
            } else if (start.equalsIgnoreCase("EXIT")) {
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid Command, try again");
            }
        }
        Player player1 = new Player(true, 0);
        game.printRoom(player1, rooms);
        game.movePlayer(player1,rooms);

        try{
            while (h){
                game.printRoom(player1, rooms);
                game.movePlayer(player1, rooms);
            }
        }
        catch (IndexOutOfBoundsException e){

        }
    }
}
