package project02startingfiles;

import project02startingfiles.PlayerData.*;
import java.util.*;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    public static void main(String[] args) {
        Player player = null;
        boolean quitFlag = false;
        Scanner input = new Scanner(System.in);
        String action;
        String playerClass = "";

        while (quitFlag == false) {
            System.out.println("Choose a character…” and “{k}Knight || {h}Healer || {w}Wizard || {t}Thief");
            action = input.nextLine();
            switch (action) {
                case "k":
                    System.out.println("Welcome, Knight!");
                    player = new Knight();
                    playerClass = "Knight";
                    quitFlag = true;
                    break;
                case "h":
                    System.out.println("Welcome, Healer!");
                    player = new Healer();
                    playerClass = "Healer";
                    quitFlag = true;
                    break;
                case "w":
                    System.out.println("Welcome, Wizard!");
                    player = new Wizard();
                    playerClass = "Wizard";
                    quitFlag = true;
                    break;
                case "t":
                    System.out.println("Welcome, Thief!");
                    player = new Thief();
                    playerClass = "Thief";
                    quitFlag = true;
                    break;
                default:
                    System.out.println("Incorrect input!");
            }
        }
        quitFlag = false;
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
                System.out.println(player);
                System.out.println("The " + playerClass + " Special Move is " + player.getSpecialMove());
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
                        System.out.println("**************************");

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
                    } else {
                        System.out.println("Incorrect input!");
                    }

                    //If not 20% hit, do rest of movement here
                } else {
                    int random;
                    random = rand.nextInt(4);
                    switch (random) {
                        case 0:
                            System.out.println("*********************");
                            System.out.println("Nothing here…");
                            System.out.println("*********************");
                            break;
                        case 1:
                            System.out.println("*********************");
                            System.out.println("Nice trees around here…");
                            System.out.println("*********************");
                            break;
                        case 2:
                            System.out.println("*********************");
                            System.out.println("Interesting cottage there…");
                            System.out.println("*********************");
                            break;
                        case 3:
                            System.out.println("*********************");
                            System.out.println("Potty break…");
                            System.out.println("*********************");
                            break;
                    }
                }
            } else if (action.equals("q")) {
                quitFlag = true;
                System.out.println("The game has come to an end! Your final stats:");
                System.out.println(player);
                System.out.println("The " + playerClass + " Special Move is " + player.getSpecialMove());
                System.out.println("Thanks for playing!");
            } else {
                System.out.println("Incorrect input!");
            }

            if (player.getHealth() == 0) {
                quitFlag = true;
                System.out.println("The game has come to an end! Your final stats:");
                System.out.println(player);
                System.out.println("The " + playerClass + " Special Move is " + player.getSpecialMove());
                System.out.println("Thanks for playing!");
            }
        }
    }
}
