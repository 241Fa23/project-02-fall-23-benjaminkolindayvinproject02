package project02startingfiles.PlayerData;

public class Wizard extends Player {

    public Wizard(int health, int score) {
        super(health, score);
    }

    @Override
    public String getSpecialMove() {
        return "Cast a Spell";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Wizard casts a spell!");
    }
}
