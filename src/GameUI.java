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
                rooms.add(new Room(roomNumber, rName, description, exits));
                System.out.println(exits.toString());

            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
  // System.out.println(exits.toString());
    }
}
