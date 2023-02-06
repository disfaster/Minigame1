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

        ArrayList<Exit> exits = new ArrayList<Exit>();
        //(2)
          File file = new File("room.txt");
          Scanner readRoomFile = new Scanner(file);

          while(readRoomFile.hasNextLine()){
             int roomNumber =  Integer.parseInt(readRoomFile.nextLine());
             String rName = readRoomFile.nextLine();
              ArrayList<String> description = new ArrayList<String>();
              String desciptionLine = "";

             while(!desciptionLine.equalsIgnoreCase("----")){
                 desciptionLine = readRoomFile.nextLine();
                 description.add(desciptionLine);
             }


              String exit = readRoomFile.nextLine();
              //call split .  use the delimiter of " "
              String[] x  = exit.split(" ");
              exits.add(new Exit(x[0], Integer.parseInt(x[1])));

              //add each object to Exit type ArrayList
              while(!exit.equalsIgnoreCase("----")){
                  exit = readRoomFile.nextLine();
                  x = exit.split(" ");
                  exits.add(new Exit(x[0], Integer.parseInt(x[1])));
              }
          }
        System.out.println(exits.toString());
    }
}
