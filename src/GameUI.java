/**
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Class: GameUI Class
//Name: Gabriel Kerven
//Date: 30 Jan 2023
//Purpose: Tester class for Minigame 1
public class GameUI {
    public static void main(String[] args) throws FileNotFoundException {

        //create a Room type ArrayList  (1)


        //(2)
          File file = new File("room.txt");
          Scanner readRoomFile = new Scanner(file);

          while(readRoomFile.hasNextLine()){
             int roomNumber =  Integer.parseInt(readRoomFile.nextLine());
             String rName = readRoomFile.nextLine();
              ArrayList<String> description = new ArrayList<String>();
              String desciptionLine = readRoomFile.nextLine();
              description.add(desciptionLine);

             while(!desciptionLine.equalsIgnoreCase("----")){
                 //complete it.

                 description.add(desciptionLine);
             }

              //create an ArrayList of Exit type.


              String exit = readRoomFile.nextLine();
              //call split .  use the delimiter of " "
              String[] x = exit.split(" ");
              //add each object to Exit type ArrayList


          }


        //



    }
}
