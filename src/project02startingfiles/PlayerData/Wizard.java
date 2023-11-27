package project02startingfiles.PlayerData;

public class Wizard extends Player {

    @Override
    public String getSpecialMove() {
        return "Cast a Spell";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Wizard casts a spell!");
    }

    @Override
    public String toString() {
        return "Wizard Status:\nHealth: " + health + "\nScore: " + score;
    }
}
