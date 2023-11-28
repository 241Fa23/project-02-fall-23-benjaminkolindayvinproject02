package project02startingfiles.PlayerData;

public class Knight extends Player {

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Knight slashes with their sword!");
    }

    @Override
    public String toString() {
        return "Knight Status:\nHealth: " + super.getHealth() + "\nScore: " + super.getScore();

    }
}
