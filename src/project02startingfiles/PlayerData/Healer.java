package project02startingfiles.PlayerData;

public class Healer extends Player {
    public Healer(int health, int score) {super(health, score);}

    @Override
    public String getSpecialMove() {
        return "Use Sleeping Powder";
    }

    @Override
    public void useSpecialMove() {

    }
}
