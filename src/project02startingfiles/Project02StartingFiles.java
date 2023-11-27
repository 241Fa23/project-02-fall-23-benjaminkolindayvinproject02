package project02startingfiles;

import project02startingfiles.PlayerData.*;
import java.util.*;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    public static void main(String[] args) {
        Player test = new Knight();
        System.out.println(test.getScore());

        boolean quitFlag = false;
        Scanner input = new Scanner(System.in);
        String action;

        while (quitFlag = false) {
            System.out.println("What would you like to do?");
            System.out.println("“{?}Status Report || "
                    + "{n} {s} {e} {w} Move 1 Space North, South, East, or West || "
                    + "{q}Quit");

            //3 if statements for status report, movement, and quit.
            action = input.nextLine();

            //status report
            if(false){

            }
            //movement if chain
            else if(false){
                //20% chance combat check
                if(false){

                }
                else{
                    //If not 20% hit, do rest of movement here
                }

            }
            else if(false){

            }
        }
    }

}
