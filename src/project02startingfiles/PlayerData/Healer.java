package project02startingfiles.PlayerData;

public class Healer extends Player {

    @Override
    public String getSpecialMove() {
        return "Use Sleeping Powder";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Healer uses the sleeping powder!");
    }

}
