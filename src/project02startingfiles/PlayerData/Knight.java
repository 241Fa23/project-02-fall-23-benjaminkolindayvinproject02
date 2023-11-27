package project02startingfiles.PlayerData;

public class Knight extends Player {

    public Knight(int health, int score) {
        super(health, score);
    }

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Knight slashes with their sword!");
    }
}
