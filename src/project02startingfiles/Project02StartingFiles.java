package project02startingfiles;

import project02startingfiles.PlayerData.*;
import java.util.*;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    public static void main(String[] args) {
        Player player = new Knight();
        System.out.println(player.getScore());

        boolean quitFlag = false;
        Scanner input = new Scanner(System.in);
        String action;

        while (quitFlag == false) {
            System.out.println("What would you like to do?");
            System.out.println("“{?}Status Report || "
                    + "{n} {s} {e} {w} Move 1 Space North, South, East, or West || "
                    + "{q}Quit");

            //3 if statements for status report, movement, and quit.
            action = input.nextLine().toLowerCase();
            Random rand = new Random();

            //status report
            if (action.equals("?")) {
                System.out.println(player.getClass() + " Status:");
                System.out.println("Health: " + player.getHealth());
                System.out.println("Score: " + player.getScore());
                System.out.println("The " + player.getClass() + " Special Move is " + player.getSpecialMove());
            } //movement if chain
            else if (action.equals("n") || action.equals("s") || action.equals("e") || action.equals("w")) {
                int chance;
                chance = rand.nextInt(6);
                if (chance == 1) {
                    int chances;
                    String Foe = "";
                    chances = rand.nextInt(3);
                    switch (chances) {
                        case 0:
                            Foe = "Bandit";
                            break;
                        case 1:
                            Foe = "Zombie";
                            break;
                        case 2:
                            Foe = "Lobbyist";
                            break;
                    }
                    System.out.println("You are being attacked by a " + Foe);
                    System.out.println("How would you like to handle this?");
                    System.out.println("{S} Use Special Move ||{R} Run");
                    System.out.print("Enter your choice: ");
                    String Choice = input.nextLine();
                    if ("s".equals(Choice)) {
                        String letter;
                        System.out.println("Prepare for battle!\nPress any letter then ENTER to continue");
                        letter = input.nextLine().toLowerCase();

                        player.useSpecialMove();
                        System.out.println("Player wins!");
                        player.setScore(2);
                    } else if ("r".equals(Choice)) {
                        int run;
                        run = rand.nextInt(6);
                        if (run <= 3) {
                            System.out.println("Run was unsuccessful");
                            player.setHealth(1);
                        } else {
                            System.out.println("Run was successful");
                        }
                    }
                    //If not 20% hit, do rest of movement here

                } else {
                    int random;
                    random = rand.nextInt(4);
                    System.out.println(random);
                    switch (random) {
                        case 0:
                            System.out.println("Nothing here…");
                            break;
                        case 1:
                            System.out.println("Nice trees around here…");
                            break;
                        case 2:
                            System.out.println("Interesting cottage there…");
                            break;
                        case 3:
                            System.out.println("Potty break…");
                            break;
                    }
                }
            } else if (action.equals("q")) {
                quitFlag = true;
                System.out.println(player);
            }
        }
    }
}
